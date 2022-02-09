package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

//https://61e281e83050a100176821ca.mockapi.io/

//http://api.icndb.com/jokes/random?firstName=John&lastName=Doe

def getRequest = new URL('https://61e281e83050a100176821ca.mockapi.io/todos')
def getConnection = getRequest.openConnection()
getConnection.requestMethod = 'GET'
assert getConnection.responseCode == 200

println getConnection.getInputStream().text

