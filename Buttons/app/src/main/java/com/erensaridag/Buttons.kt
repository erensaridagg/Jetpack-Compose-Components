package com.example.compose.snippets.button

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AllButtonExamples() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {

            // 1. Basit Buton
            Button(onClick = { /* TODO */ }) {
                Text("Tıkla")
            }

            // 2. Geniş Buton
            Button(
                onClick = { /* TODO */ },
                modifier = Modifier.fillMaxWidth(0.8f) // Ekranın %80'i kadar genişlik
            ) {
                Text("Tam Genişlikte Buton")
            }

            // 3. Renkli Buton
            Button(
                onClick = { /* TODO */ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF1976D2),
                    contentColor = Color.White
                )
            ) {
                Text("Renkli Buton")
            }

            // 4. İkonlu Buton
            Button(onClick = { /* TODO */ }) {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.width(8.dp))
                Text("Beğen")
            }

            // 5. OutlinedButton
            OutlinedButton(onClick = { /* TODO */ }) {
                Text("Çerçeveli Buton")
            }

            // 6. TextButton
            TextButton(onClick = { /* TODO */ }) {
                Text("Text Button")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AllButtonExamplesPreview() {
    MaterialTheme {
        AllButtonExamples()
    }
}
