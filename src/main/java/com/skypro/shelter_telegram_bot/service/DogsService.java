package com.skypro.shelter_telegram_bot.service;

import com.skypro.shelter_telegram_bot.model.Dog;
import com.skypro.shelter_telegram_bot.repository.DogsRepository;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class DogsService {

    private final DogsRepository dogsRepository;

    public DogsService(DogsRepository dogsRepository) {
        this.dogsRepository = dogsRepository;

    }

    /**
     * Метод добавления собаки
     *
     * @param dog создается объект собака
     * @return собака
     */
    public Dog addDog(Dog dog) {
        return dogsRepository.save(dog);
    }

    /**
     * Метод поиска собаки по ее идентификатору в БД.
     * <br>
     * Используется метод репозитория {@link org.springframework.data.jpa.repository.JpaRepository#findById(Object)}
     *
     * @param id идентификатор искомой собаки
     * @return найденная собака
     */
    public Dog getDog(Long id) {
        return dogsRepository.findById(id).orElse(null);
    }

    /**
     * Метод редактирования характеристик собаки.
     *
     * @param dog собака, которая нуждается в редактировании
     * @return исправленные характеристики собаки
     */
    public Dog editDog(Long id, Dog dog) {
        Optional<Dog> optional = dogsRepository.findById(id);
        if (optional.isPresent()) {
            Dog fromDB = optional.get();
            fromDB.setName(dog.getName());
            fromDB.setAge(dog.getAge());
            return dogsRepository.save(fromDB);
        }
        return null;
    }

    /**
     * Метод удаления собаки из БД
     *
     * @param id идентификатор удаляемой собаки
     */
    public void deleteDog(Long id) {
        dogsRepository.deleteById(id);
    }


}
