package helloworld

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class CollectionRecordController {

    CollectionRecordService collectionRecordService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond collectionRecordService.list(params), model:[collectionRecordCount: collectionRecordService.count()]
    }

    def show(Long id) {
        respond collectionRecordService.get(id)
    }

    def create() {
        respond new CollectionRecord(params)
    }

    def save(CollectionRecord collectionRecord) {
        if (collectionRecord == null) {
            notFound()
            return
        }

        try {
            collectionRecordService.save(collectionRecord)
        } catch (ValidationException e) {
            respond collectionRecord.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'collectionRecord.label', default: 'CollectionRecord'), collectionRecord.id])
                redirect collectionRecord
            }
            '*' { respond collectionRecord, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond collectionRecordService.get(id)
    }

    def update(CollectionRecord collectionRecord) {
        if (collectionRecord == null) {
            notFound()
            return
        }

        try {
            collectionRecordService.save(collectionRecord)
        } catch (ValidationException e) {
            respond collectionRecord.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'collectionRecord.label', default: 'CollectionRecord'), collectionRecord.id])
                redirect collectionRecord
            }
            '*'{ respond collectionRecord, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        collectionRecordService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'collectionRecord.label', default: 'CollectionRecord'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'collectionRecord.label', default: 'CollectionRecord'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
