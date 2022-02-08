package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

import groovy.xml.MarkupBuilder

FileWriter fileWriter = new FileWriter('html/todo.html')
MarkupBuilder markupBuilder = new MarkupBuilder(fileWriter)

List todos = [
        [id: 1, title: 'First Todo', completed: false],
        [id: 2, title: 'Second Todo', completed: true]
]

markupBuilder.html {
    head {
        title 'PracticeGroovy'
        description 'Learning and practicing Groovy'
    }
    body {
        h1 'PracticeGroovy'
        section {
            h2 'Todos'
            table {
                tr {
                    th 'Todo'
                    th 'Completed'
                }
//                tr {
//                    td 'First Todo'
//                    td 'False'
//                }
                todos.each {todo ->
                    td todo.title
                    td todo.completed
                }
            }
        }
    }
}

