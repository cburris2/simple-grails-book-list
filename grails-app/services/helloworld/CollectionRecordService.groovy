package helloworld

import grails.gorm.services.Service

@Service(CollectionRecord)
interface CollectionRecordService {

    CollectionRecord get(Serializable id)

    List<CollectionRecord> list(Map args)

    Long count()

    void delete(Serializable id)

    CollectionRecord save(CollectionRecord collectionRecord)

}