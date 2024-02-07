package es.yeffry.valorantapi.domain.repository

interface MapperInterface<DataEntity,DomainEntity> {
    fun DataEntity.toDomain(): DomainEntity
}