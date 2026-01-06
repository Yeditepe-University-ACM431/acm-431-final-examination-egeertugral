package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    private val _tasks = mutableStateListOf(
        Task(1, "Submit Final Project", false),
        Task(2, "Study for Engin Kandıran's Hard Exam", true),
        Task(3, "Present Final Project to our kind Teacher", true)
    )
    val tasks: List<Task> = _tasks

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        val index = _tasks.indexOfFirst { it.id == taskId }
        if (index != -1) {
            val task = _tasks[index]
            _tasks[index] = task.copy(isCompleted = !task.isCompleted)
        }
    }

}
}

