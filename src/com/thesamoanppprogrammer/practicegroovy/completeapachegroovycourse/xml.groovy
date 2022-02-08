package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

import groovy.xml.MarkupBuilder

//Write to file
FileWriter fileWriter = new FileWriter('data/todos.xml')
MarkupBuilder markupBuilder = new MarkupBuilder(fileWriter)

markupBuilder.todos {
    todo(id:1) {
        todo 'First Todo'
        completed false
    }
    todo(id:2) {
        todo 'Second Todo'
        completed false
    }
    todo(id:3) {
        todo 'Third Todo'
        completed false
    }
}

