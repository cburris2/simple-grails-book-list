<!DOCTYPE html>
<html>
    <head>
        <meta name="layout" content="main" />
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <g:set var="entityName" value="${message(code: 'book.label', default: 'Book')}" />
        <title><g:message code="default.list.label" args="[entityName]" /></title>
        <style>
        	th.name::before{ font-family: "Font Awesome 5 Free"; font-weight: bolder; content: "\f338"; } 
       		th.name.sortable.sorted.asc::before{ font-family: "Font Awesome 5 Free"; font-weight: bolder; content: "\f15e"; }
        	th.name.sortable.sorted.desc::before{ font-family: "Font Awesome 5 Free"; font-weight: bolder; content: "\f15d"; }
        </style>
    </head>
    <body>
        <ul class="nav justify-content-end">
		  <li class="nav-item">
		    <a class="nav-link active" href="#">Active</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="#">Link</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link" href="#">Link</a>
		  </li>
		  <li class="nav-item">
		    <a class="nav-link disabled" href="#">Disabled</a>
		  </li>
		</ul>

        <div class="bg-light" id="list-book" class="content scaffold-list" role="main">
            <h1><g:message code="default.list.label" args="[entityName]" /></h1>
            <g:if test="${flash.message}">
                <div class="message" role="status">${flash.message}</div>
            </g:if>
			<table>
				<th>
					<g:sortableColumn property="name" title="Name" class="name" />
				</th>
				<th> Author
				</th>
				<tbody>
            	<g:each in="${bookList}" class="warning" var="books" status="i">
					<tr> 
					<td class="text-danger"> ${books.name} </td>
					<td> ${books.author} </td>
					</tr> <br />
            	</g:each>
			</table>
            <div class="pagination">
                <g:paginate total="${bookCount ?: 0}" />
            </div>
        </div>
    </body>
</html>