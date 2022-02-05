# Проект по разработке автотестов для интернет-кинотеатра [START](https://start.ru/ "START")
### Технологический стек
________
<img src="image/logo/Java.svg" width="50" height="50"/> <img src="image/logo/Intelij_IDEA.svg" width="50" height="50"/> <img src="image/logo/Gradle.svg" width="50" height="50"/> <img src="image/logo/JUnit5.svg" width="50" height="50"/> <img src="image/logo/Selenide.svg" width="50" height="50"/> <img src="image/logo/GitHub.svg" width="50" height="50"/> <img src="image/logo/Jenkins.svg" width="50" height="50"/> <img src="image/logo/Selenoid.svg" width="50" height="50"/> <img src="image/logo/Allure_Report.svg" width="50" height="50"/> <img src="image/logo/Allure_TestOps.svg" width="50" height="50"/> <img src="image/logo/Jira.svg" width="50" height="50"/> <img src="image/logo/Telegram.svg" width="50" height="50"/>

-----
* Автотесты написаны на ``Java`` с использованием фреймворка ``Selenide``.
* ``JUnit 5`` фреймворк для модульного тестирования.
* ``Gradle`` используется для автоматизированной сборки проекта.
* С помощью ``Jenkins`` выполняется запуск тестов.
* ``Selenoid`` выполняет запуск браузеров в контейнерах ``Docker``.
* ``Allure Report`` формирует отчет о запуске тестов.
* Автотесты интегрируются с тест-менеджмент системой ``Allure TestOps`` и таск-трекер системой ``Jira``
* В ``Telegram`` бот отправляет уведомления о результатах прохождения тестов.

### ✅  Реализованы следующие тест-кейсы
2. Проверка наличия элементов главной страници
3. Проверка функции поиска фильмов на сайте.
4. Проверка авторизации до запроса капчи.
5. Проверка наличия элементов на страници фильма.
6. Проверка регистрации.


### 🚀 Запуск тестов из терминала
* Локально ``gradle clean properties_test-Dselenoid=selenoid.autotests.cloud/wd/hub-Dthreads=5``

### <img src="image/logo/Jenkins.svg" width="40" height="40"/> Конфигурация Job в Jenkins 
🔴 Открыть сборку [Jenkins](https://jenkins.autotests.cloud/job/009_Artem_Kulakov_HomeWork13/).  
🔴 Нажать **"Собрать с параметрами"**.  
🔴 Указать необходимые параметры.  
🔴 Нажать на кнопку **"Собрать"**.  

<img src="image/screenshots/img_9.png">  

🔴 Для формирования отчета о прохождении тестов в Allure Report необходимо нажать на ссылку/иконку **"Allure Report"**.  

<img src="image/screenshots/allure report1.jpg" width="1000" height="600"/>  
<img src="image/screenshots/img_1.png">

### <img src="image/logo/Allure_Report.svg" width="30" height="30"/> Отчет о результатах тестирования в Allure Report

<details>
  <summary>Подробнее</summary>  
  
**1.** Страница «Suites».  

На данной странице представляется распределение выполнявшихся тестов по тестовым наборам или классам, в которых находятся тестовые методы.

<img src="image/screenshots/img_6.png">  

**2.** Страница «Timeline».  

Данная страница визуализирует временные рамки прохождения каждого теста.  

<img src="image/screenshots/img_7.png">  

</details>  

### <img src="image/logo/Allure_TestOps.svg" width="30" height="30"/> Интеграция тестов c тест-менеджмент системой [Allure TestOps](https://allure.autotests.cloud/project/996/dashboards)

<details>
  <summary>Подробнее</summary> 

  
📎 **Dashboards.**  

<img src="image/screenshots/img_4.png/">  
  
  

### <img src="image/logo/Jira.svg" width="30" height="30"/> Интеграция тестов c таск-трекер системой [Jira](https://jira.autotests.cloud/browse/HOMEWORK-323)  

<img src="image/screenshots/img_5.png/">  
 

### <img src="image/logo/Telegram.svg" width="30" height="30"/> Уведомления о прохождении тестов в Telegram  

<img src="image/screenshots/img_8.png/">  
