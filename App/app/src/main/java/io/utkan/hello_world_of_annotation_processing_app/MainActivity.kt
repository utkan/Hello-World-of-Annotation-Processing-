package io.utkan.hello_world_of_annotation_processing_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.utkan.generator.annotations.GenName
import io.utkan.generator.annotations.Kson

@GenName
class Hello

@Kson
data class User(val name: String,
                val email: String)


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Hello ${Generated_Hello().getName()}")
        println("User to JSON")
        val user = User(
            name = "Test",
            email = "test@email.com"
        )
        println("User: $user")
        println("Json: ${user.toJson()}")

    }
}
