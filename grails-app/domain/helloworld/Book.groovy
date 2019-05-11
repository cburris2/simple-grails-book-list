package helloworld

class Book {
	String id

	String name
	String author


	static constraints = {
		id maxSize: 100
		name nullable: false
		author nullable: false
	}
}
