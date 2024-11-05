package br.com.alura.screensound.data

import br.com.alura.screensound.data.entities.AlbumEntity
import br.com.alura.screensound.models.Album
import br.com.alura.screensound.utils.toEntity
import br.com.alura.screensound.utils.toModel
import javax.persistence.EntityManager

class AlbumDAO(manager: EntityManager): DAO<Album, AlbumEntity>(manager, AlbumEntity::class.java) {
    override fun toModel(entity: AlbumEntity): Album {
        return entity.toModel()
    }

    override fun toEntity(model: Album): AlbumEntity {
        return model.toEntity()
    }
}