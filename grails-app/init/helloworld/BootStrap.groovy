package helloworld

class BootStrap {

	def init = { servletContext ->

		new Book(name: 'Grails for others', author: 'AJ Goobie').save()
		new Book(name: 'Pursuit of God', author: 'AW Tozer').save()
		new Book(name: 'Grails for noobs', author: 'Mac Daddy').save()

	}
	def destroy = {
	}
}
