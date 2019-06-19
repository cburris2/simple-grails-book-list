package helloworld

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class CollectionRecordSpec extends Specification implements DomainUnitTest<CollectionRecord> {

    def setup() {
    }

    def cleanup() {
    }

    void "test something"() {
        expect:"fix me"
            true == false
    }
}
