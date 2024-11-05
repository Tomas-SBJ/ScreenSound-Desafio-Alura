package br.com.alura.screensound.data

import br.com.alura.screensound.data.entities.BandaEntity
import br.com.alura.screensound.models.Banda
import br.com.alura.screensound.utils.toEntity
import br.com.alura.screensound.utils.toModel
import javax.persistence.EntityManager

class BandaDAO(manager: EntityManager): DAO<Banda, BandaEntity>(manager, BandaEntity::class.java) {
    override fun toModel(entity: BandaEntity): Banda {
        return entity.toModel()
    }

    override fun toEntity(model: Banda): BandaEntity {
        return model.toEntity()
    }
}