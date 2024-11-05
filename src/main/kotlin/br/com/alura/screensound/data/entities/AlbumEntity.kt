package br.com.alura.screensound.data.entities

import javax.persistence.*

@Entity
@Table(name = "albuns")
open class AlbumEntity(
    val titulo: String = "Titulo",
    @ManyToOne
    val banda: BandaEntity = BandaEntity(),
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0
)