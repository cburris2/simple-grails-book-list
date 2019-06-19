package helloworld

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CollectionRecordServiceSpec extends Specification {

    CollectionRecordService collectionRecordService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CollectionRecord(...).save(flush: true, failOnError: true)
        //new CollectionRecord(...).save(flush: true, failOnError: true)
        //CollectionRecord collectionRecord = new CollectionRecord(...).save(flush: true, failOnError: true)
        //new CollectionRecord(...).save(flush: true, failOnError: true)
        //new CollectionRecord(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //collectionRecord.id
    }

    void "test get"() {
        setupData()

        expect:
        collectionRecordService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CollectionRecord> collectionRecordList = collectionRecordService.list(max: 2, offset: 2)

        then:
        collectionRecordList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        collectionRecordService.count() == 5
    }

    void "test delete"() {
        Long collectionRecordId = setupData()

        expect:
        collectionRecordService.count() == 5

        when:
        collectionRecordService.delete(collectionRecordId)
        sessionFactory.currentSession.flush()

        then:
        collectionRecordService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CollectionRecord collectionRecord = new CollectionRecord()
        collectionRecordService.save(collectionRecord)

        then:
        collectionRecord.id != null
    }
}
