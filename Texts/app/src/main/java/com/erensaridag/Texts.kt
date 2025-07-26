package com.example.compose.snippets.text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AllTextExamples() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        // 1. Basit Padding ve Arka Plan
        Text(
            text = "Padding ve arka plan",
            modifier = Modifier
                .padding(8.dp)
                .background(Color.Cyan)
                .padding(8.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 2. TextStyle Kullanımı
        Text(
            text = "Özel stilli yazı",
            style = TextStyle(
                fontSize = 22.sp,
                fontFamily = FontFamily.Serif,
                letterSpacing = 2.sp,
                lineHeight = 28.sp
            )
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 3. Renk ve Kalınlık
        Text(
            text = "Kırmızı ve kalın yazı",
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 4. Uzun metin, maxLines ve overflow
        Text(
            text = "Bu çok uzun bir metindir ve sığmadığında kesilmesi gerekir çünkü ekran genişliği yeterli değildir.",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(8.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 5. Hepsi bir arada
        Text(
            text = "Tüm özellikleri kullanan örnek yazı",
            modifier = Modifier
                .padding(8.dp)
                .background(Color(0xFFDDFFDD))
                .padding(horizontal = 12.dp, vertical = 8.dp),
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                fontFamily = FontFamily.Monospace,
                letterSpacing = 1.5.sp,
                lineHeight = 24.sp
            ),
            color = Color(0xFF006600),
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 6. Hizalanmış yazı
        Text(
            text = "Ortalanmış yazı",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFE0F7FA))
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AllTextExamplesPreview() {

    AllTextExamples()
}
