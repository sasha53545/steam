package com.akazakov.steam_db.config;

import com.akazakov.steam_db.model.*;
import com.akazakov.steam_db.repository.*;
import jakarta.annotation.PostConstruct;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@Profile("!prod")
@ConditionalOnProperty(name = "init.db", havingValue = "true")
@Configuration
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Slf4j
public class InitDB {
    AccountRepository accountRepository;
    GenreRepository genreRepository;
    GameRepository gameRepository;
    RegionRepository regionRepository;
    AchievementRepository achievementRepository;

    @PostConstruct
    public void init() {
        log.info("Init DB with test data");
        Account account1 = Account.builder().name("Кирилл").accountStatus(AccountStatus.NOT_IN_PLACE).build();
        Account account2 = Account.builder().name("Антон").accountStatus(AccountStatus.INVISIBLE).build();
        Account account3 = Account.builder().name("Александр").accountStatus(AccountStatus.ONLINE).build();

        List<Account> accountList = List.of(account1, account2, account3);

        accountRepository.saveAll(accountList);

        Genre genreStrategy = Genre.builder().name("Стратегия").build();
        Genre genreAction = Genre.builder().name("Экшен").build();
        Genre genreQuest = Genre.builder().name("Квест").build();
        Genre genreRPG = Genre.builder().name("RPG").build();
        Genre genreSimulator = Genre.builder().name("Симуляторы").build();
        Genre genreIndie = Genre.builder().name("Инди").build();
        Genre genreSandbox = Genre.builder().name("Песочница").build();

        List<Genre> genreList = List.of(genreStrategy, genreAction, genreQuest, genreRPG, genreSimulator, genreIndie, genreSandbox);

        genreRepository.saveAll(genreList);

        Game game1 = Game.builder().name("Minecraft").description("Minecraft — это игра, которая состоит из блоков, существ и сообщества. С помощью блоков можно преобразовывать мир или создавать фантастические работы. С существами можно воевать или дружить в зависимости от твоего стиля игры. Окунись в эпические приключения самостоятельно или с друзьями — все варианты хороши.\n" + "Если только ты не копаешь прямо вниз.").genre(genreSandbox).build();
        Game game2 = Game.builder().name("Valheim").description("Игра в жанре выживание, в которой вам предстоит исследовать огромный фэнтезийный мир, пропитанный скандинавской мифологией и культурой викингов.").genre(genreSandbox).build();
        Game game3 = Game.builder().name("Northgard").description("Northgard — тепло принятая критиками стратегия, вдохновленная скандинавской мифологией. Возглавьте клан, откройте тайны неизведанных земель и победите врагов, чтобы добраться до вершин власти!").genre(genreIndie).build();
        Game game4 = Game.builder().name("Assassin’s Creed Odyssey").description("Игра в жанре выживание, в которой вам предстоит исследовать огромный фэнтезийный мир, пропитанный скандинавской мифологией и культурой викингов.").genre(genreRPG).build();
        Game game5 = Game.builder().name("Stronghold: Definitive Edition").description("Приветствуем вас, сир! Ваша крепость ждет вас. Развивайте свои земли и осаждайте замки колоритных противников в «симуляторе замка», заложившем основы жанра.").genre(genreStrategy).build();

        List<Game> gameList = List.of(game1, game2, game3, game4, game5);

        gameRepository.saveAll(gameList);

        Region region1 = Region.builder().name("Российская Федерация").regionType(RegionType.COUNTRY).build();
        Region region2 = Region.builder().name("США").regionType(RegionType.COUNTRY).build();
        Region region3 = Region.builder().name("Украина").regionType(RegionType.COUNTRY).build();
        Region region4 = Region.builder().name("Китай").regionType(RegionType.COUNTRY).build();

        List<Region> regionList = List.of(region1, region2, region3, region4);

        regionRepository.saveAll(regionList);

//        Achievement achievement1 = Achievement.builder().game(gameRepository.findByName()).name("").description().build();
//        Achievement achievement2 = Achievement.builder().game(gameRepository.findByName()).name("").name("").description().build();
//        Achievement achievement3 = Achievement.builder().game(gameRepository.findByName()).name("").name("").description().build();
//        Achievement achievement4 = Achievement.builder().game(gameRepository.findByName()).name("").name("").description().build();
//        Achievement achievement5 = Achievement.builder().game(gameRepository.findByName()).name("").name("").description().build();
//
//        List<Achievement> achievementList = List.of(achievement1, achievement2, achievement3, achievement4, achievement5);
//
//        achievementRepository.saveAll(achievementList);
    }
}
