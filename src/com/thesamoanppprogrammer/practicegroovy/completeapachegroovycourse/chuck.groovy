package com.thesamoanppprogrammer.practicegroovy.completeapachegroovycourse

def postmanGet = new URL('http://api.icndb.com/jokes/random?firstName=John&lastName=Doe')
def getConnection = postmanGet.openConnection()
getConnection.requestMethod = 'GET'
assert getConnection.responseCode == 200

println getConnection.getInputStream().text

