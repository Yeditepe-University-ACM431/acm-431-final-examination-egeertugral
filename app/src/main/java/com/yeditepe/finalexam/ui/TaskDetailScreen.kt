package com.yeditepe.finalexam.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
@Composable
fun TaskDetailScreen(title: String) {

    Column(modifier = Modifier.padding(16.dp)) {
        // TODO 4: Display task title
        Text(
        text = title,
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold
    )
    }
}
