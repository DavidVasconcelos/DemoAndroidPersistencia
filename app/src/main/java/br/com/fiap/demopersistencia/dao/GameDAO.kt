package br.com.fiap.demopersistencia.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import br.com.fiap.demopersistencia.model.Game

@Dao
interface GameDAO {

    @Insert
    fun inserir(game: Game)

    @Delete
    fun apagar(game: Game)

    @Update
    fun atualizar(game: Game)

    @Query("SELECT * FROM Game")
    fun lerGames(): LiveData<List<Game>>

    @Query("SELECT * FROM Game WHERE id = :id")
    fun buscarPordId(id: Int): Game
}