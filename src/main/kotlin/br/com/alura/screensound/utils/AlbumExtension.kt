package br.com.alura.screensound.utils

import br.com.alura.screensound.data.entities.AlbumEntity
import br.com.alura.screensound.models.Album

fun Album.toEntity(): AlbumEntity {
    return AlbumEntity(this.titulo, this.banda.toEntity(), this.id)
}

fun AlbumEntity.toModel(): Album {
    return Album(this.titulo, this.banda.toModel(), this.id)
}