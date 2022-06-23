package com.harivansh.todo

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.harivansh.todo.ui.theme.ToDoTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ToDoTheme {

                PreviewTaskCard()
            }
        }
    }
}

data class Task(val taskName: String, val status: Boolean)

@Composable
fun TaskCard(taskName: String) {
    Card {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
        ) {

            Text(text = "hello")

            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.edit_icon), contentDescription = "edit icon")
            Spacer(modifier = Modifier.width(10.dp))
            Image(painter = painterResource(id = R.drawable.delete_icon), contentDescription = "delete icon")


        }
    }
}


@Composable
fun Tasks(tasks: List<Task>) {
    LazyColumn {

        items(tasks) { tasks ->

            TaskCard(taskName = tasks.taskName)
        }
    }


}
//
//@Preview(
//    name = "Light Mode"
//)
//@Preview(
//    uiMode = Configuration.UI_MODE_NIGHT_YES,
//    showBackground = true,
//    name = "Dark Mode"
//)

val tasks = listOf(
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),
    Task("hello", true),

)


@Preview
@Composable
fun PreviewTaskCard() {

    ToDoTheme {

        Tasks(tasks = tasks)

    }

}
