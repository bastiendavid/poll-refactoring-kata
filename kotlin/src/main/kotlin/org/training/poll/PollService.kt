package org.training.poll

import java.util.ArrayList
import java.util.HashMap


class PollService {

    private val polls = HashMap<Int, ArrayList<String>>()
    private val results = HashMap<Int, ArrayList<Int>>()

    @Throws(InvalidPollIdException::class)
    fun createPoll(id: Int, question: String, answers: ArrayList<String>) {
        if (polls[id] != null || results[id] != null) {
            throw InvalidPollIdException(id)
        }
        val poll = ArrayList<String>()
        poll.add(question)
        poll.addAll(answers)
        polls[id] = poll
        results[id] = ArrayList()
    }

    @Throws(InvalidPollIdException::class)
    fun vote(id: Int, answer: Int) {
        if (results[id] == null) {
            throw InvalidPollIdException(id)
        }
        val poll = results[id] ?: throw InvalidPollIdException(id)
        poll.add(answer)
    }

    @Throws(InvalidPollIdException::class)
    fun printResults(id: Int) {
        if (polls[id] == null || results[id] == null) {
            throw InvalidPollIdException(id)
        }
        val poll = polls[id]!!
        val result = results[id]!!
        println(poll[0])
        for (i in 1 until poll.size) {
            var nbVote = 0
            for (r in result) {
                if (r == i - 1) {
                    ++nbVote
                }
            }
            println("${poll[i]} ($nbVote)")
        }
    }
}
