package org.training.poll

import java.util.*

fun main(args: Array<String>) {
    val pollService = PollService()
    try {
        pollService.createPoll(
            0,
            "What is your favorite color?",
            ArrayList(listOf("Blue", "Green", "Red", "Yellow"))
        )
        pollService.vote(0, 0)
        pollService.vote(0, 0)
        pollService.vote(0, 0)
        pollService.vote(0, 3)
        pollService.vote(0, 2)
        pollService.printResults(0)
    } catch (e: InvalidPollIdException) {
        e.printStackTrace()
    }
}
