package edu.asu.cse535.project5.datamodel

data class RecommendedExerciseBody(
    val calories_goal: Int,
    val height: Int,
    val previous_exercise: String,
    val weight: Int
)