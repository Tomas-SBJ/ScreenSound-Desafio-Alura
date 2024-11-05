package br.com.alura.screensound.utils

import br.com.alura.screensound.data.entities.BandaEntity
import br.com.alura.screensound.models.Banda

fun Banda.toEntity(): BandaEntity {
    return BandaEntity(this.nome, this.descricao, this.id)
}

fun BandaEntity.toModel(): Banda {
    return Banda(this.nome, this.descricao, this.id)
}