package helloworld

class CollectionRecord {
	String id
	String uuid
	String configurations
	String iso_xml
	String data_managers
	Date last_updated

	//	Collection Store Record
	//	UUID
	//	Configurations
	//	ISO Metadata XML Blob
	//	Data Managers
	//	Last Updated

	static constraints = {
		iso_xml maxSize: 1024 * 1024 * 10
	}
}
