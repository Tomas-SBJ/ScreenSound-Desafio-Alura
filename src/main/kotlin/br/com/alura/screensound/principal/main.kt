package br.com.alura.screensound.principal

import br.com.alura.screensound.data.AlbumDAO
import br.com.alura.screensound.data.BandaDAO
import br.com.alura.screensound.data.Base
import br.com.alura.screensound.models.Album

fun main() {
    val manager = Base.getEntityManager()
    val bandaDao = BandaDAO(manager)
    val albumDao = AlbumDAO(manager)

    val banda = bandaDao.getById(2)

    val goBack = Album("Go Back", banda)
    val cabecaDinossauro = Album("Cabeça Dinossauro", banda)

    albumDao.create(goBack)
    albumDao.create(cabecaDinossauro)

    val albuns = albumDao.getList()

    println(albuns)

    manager.close()
}