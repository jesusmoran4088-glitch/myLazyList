package udg.cuvalles.mylazylist

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun myRowLazy(modifier: Modifier = Modifier) {
    val datos01 = listOf(
        "Lunes",
        "Martes",
        "Miércoles",
        "Jueves",
        "Viernes",
        "Sábado",
        "Domingo"
    )

    LazyRow(
        modifier = modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(8.dp)
    ) {
        item {
            Text(text = "Días de la Semana: ", modifier = Modifier.padding(end = 8.dp))
        }
        items(datos01) { item ->
            Text(text = item, modifier = Modifier.padding(end = 12.dp))
        }
    }
}