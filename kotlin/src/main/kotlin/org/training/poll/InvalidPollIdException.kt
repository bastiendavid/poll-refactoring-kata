package org.training.poll

class InvalidPollIdException(id: Int) : Throwable("Id of poll is invalid: $id")
