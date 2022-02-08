

import groovy.transform.ToString

@ToString(includeNames = true)
class Todo {
    String todoTitle
    Boolean completed
}

ObjectGraphBuilder objectGraphBuilder = new ObjectGraphBuilder()

def todo = objectGraphBuilder.todo(
        todoTitle: 'First Todo', completed: false
)

println todo

