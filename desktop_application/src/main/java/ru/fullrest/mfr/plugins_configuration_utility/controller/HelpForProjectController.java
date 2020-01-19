package ru.fullrest.mfr.plugins_configuration_utility.controller;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import ru.fullrest.mfr.plugins_configuration_utility.manager.StageManager;

@Log4j2
public class HelpForProjectController implements AbstractController {

    @Autowired
    private StageManager stageManager;

    @FXML
    private TextArea text;

    @Setter
    private boolean firstStart = false;

    @Override
    public void beforeOpen() {
        if (firstStart) {
            text.setText("Команда сервера делает всё для стабильной работы сервера и улучшения игры. \n\n" +
                    "Нам важна любая помощь. Если вы пишете скрипты на LUA, мододел, активный игрок и просто готовы порекомендовать нас друзьям — вы нам нужны. \n\n" +
                    "Кроме того, мы благодарны за пожертвования на оплату хостинга.\n\n" +
                    "Поблагодарить и помочь можно здесь:\n" +
                    "4100110152065537 (Yandex-кошелёк).\n\n" +
                    "Отдельное спасибо:\n" +
                    "нашим игрокам;\n" +
                    "и команде www.fullrest.ru — за помощь в создании лаунчера.");
            firstStart = false;
        } else {
            text.setText("Команда сервера делает всё для стабильной работы сервера и улучшения игры. \n\n" +
                    "Нам важна любая помощь. Если вы пишете скрипты на LUA, мододел, активный игрок и просто готовы порекомендовать нас друзьям — вы нам нужны. \n\n" +
                    "Кроме того, мы благодарны за пожертвования на оплату хостинга.\n\n" +
                    "Поблагодарить и помочь можно здесь:\n" +
                    "4100110152065537 (Yandex-кошелёк).\n\n" +
                    "Отдельное спасибо:\n" +
                    "нашим игрокам;\n" +
                    "и команде www.fullrest.ru — за помощь в создании лаунчера.");
        }
    }

    public void close() {
        stageManager.getHelpForProjectStage().close();
    }

}