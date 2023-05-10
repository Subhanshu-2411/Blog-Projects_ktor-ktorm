package com.example.di

import com.example.data.repository.NotesRepository
import com.example.data.service.NotesService
import com.example.data.service.NotesServiceImplementation
import org.koin.dsl.module

val notesModule = module {
    single<NotesService> { NotesServiceImplementation(get()) } // get() Will resolve NotesRepository
    single { NotesRepository() }
}