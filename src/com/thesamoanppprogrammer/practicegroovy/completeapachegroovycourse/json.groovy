package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

import groovy.json.JsonBuilder

JsonBuilder jsonBuilder = new JsonBuilder()

jsonBuilder.todos {
    currentTodo {
        todo 'First Todo'
        completed false
    }
    nextTodo {
        todo 'Second Todo'
        completed false
    }
}

println jsonBuilder.toString()
println jsonBuilder.toPrettyString()

new File('json/todo.json').write(jsonBuilder.toPrettyString())

