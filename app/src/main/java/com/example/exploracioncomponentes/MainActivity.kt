package com.example.exploracioncomponentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// 1. LazyColumn: lista vertical con scroll que solo dibuja lo que se ve
@Composable
fun EjemploLazyColumn() {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(20) { indice ->
            Surface(
                modifier = Modifier.fillMaxWidth(),
                color = MaterialTheme.colorScheme.primaryContainer,
                shape = RoundedCornerShape(8.dp)
            ) {
                Text(
                    text = "Elemento ${indice + 1}",
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}

@Preview(name = "LazyColumn", showBackground = true)
@Composable
fun PreviewLazyColumn() {
    EjemploLazyColumn()
}

// 2. LazyRow: lista horizontal con scroll
@Composable
fun EjemploLazyRow() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(20) { indice ->
            Box(
                modifier = Modifier
                    .size(80.dp)
                    .background(
                        MaterialTheme.colorScheme.secondaryContainer,
                        RoundedCornerShape(8.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "${indice + 1}")
            }
        }
    }
}

@Preview(name = "LazyRow", showBackground = true)
@Composable
fun PreviewLazyRow() {
    EjemploLazyRow()
}

// 3. Grid: cuadrícula de 3 x 3 armada con Column y Row
@Composable
fun EjemploGrid() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        repeat(3) { fila ->
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                repeat(3) { columna ->
                    Box(
                        modifier = Modifier
                            .size(80.dp)
                            .background(
                                MaterialTheme.colorScheme.tertiaryContainer,
                                RoundedCornerShape(8.dp)
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(text = "${fila * 3 + columna + 1}")
                    }
                }
            }
        }
    }
}

@Preview(name = "Grid", showBackground = true)
@Composable
fun PreviewGrid() {
    EjemploGrid()
}

// 4. Scaffold: estructura de pantalla con barra superior, contenido y barra inferior
@Composable
fun EjemploScaffold() {
    Scaffold(
        modifier = Modifier.height(300.dp),
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .padding(16.dp)
            ) {
                Text(text = "Barra superior", color = MaterialTheme.colorScheme.onPrimary)
            }
        },
        bottomBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.secondary)
                    .padding(16.dp)
            ) {
                Text(text = "Barra inferior", color = MaterialTheme.colorScheme.onSecondary)
            }
        }
    ) { paddingInterno ->
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingInterno),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Contenido de la pantalla")
        }
    }
}

@Preview(name = "Scaffold", showBackground = true)
@Composable
fun PreviewScaffold() {
    EjemploScaffold()
}

// 5. Surface: superficie con color, forma y sombra donde se coloca contenido
@Composable
fun EjemploSurface() {
    Surface(
        modifier = Modifier.padding(16.dp),
        color = MaterialTheme.colorScheme.primaryContainer,
        shape = RoundedCornerShape(16.dp),
        shadowElevation = 8.dp
    ) {
        Text(
            text = "Texto dentro de una Surface",
            modifier = Modifier.padding(24.dp)
        )
    }
}

@Preview(name = "Surface", showBackground = true)
@Composable
fun PreviewSurface() {
    EjemploSurface()
}