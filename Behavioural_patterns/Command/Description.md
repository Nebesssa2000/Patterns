# Название: Команда (Command)

## Тип: Поведенческий паттерн

## Область применения
Используется для инкапсуляции запроса в объект, позволяя параметризовать объекты с операциями, ставить запросы в 
очередь или протоколировать их, а также поддерживать отмену операций.

## Краткое описание
Паттерн Команда превращает запросы в объекты, позволяя передавать их как аргументы при вызове методов, ставить в 
очередь, логировать и поддерживать отмену операций. Это позволяет отделить объект, инициирующий операцию, от объекта, 
который знает, как эту операцию выполнить.

## В каких задачах лучше применять
- Когда необходимо параметризовать объекты выполняемыми операциями.
- Когда необходимо ставить операции в очередь, логировать их или поддерживать отмену.
- Когда необходимо передавать операции в качестве аргументов методов.
- **Конкретные задачи из реальных проектов:**
    - Обработка запросов аутентификации и авторизации.
    - Управление транзакциями в системах управления базами данных.
    - Реализация операций отмены (undo) и повтора (redo) в текстовых редакторах и других приложениях.
    - Управление командами в системах домашней автоматизации (умный дом).
    - Обработка команд в игровых движках для управления действиями персонажей.

## Сравнение с конкурирующими паттернами
- **Цепочка обязанностей (Chain of Responsibility)**: Паттерн Цепочка обязанностей передает запрос по цепочке 
    обработчиков, тогда как Команда инкапсулирует запрос в объект.
- **Стратегия (Strategy)**: Паттерн Стратегия определяет семейство алгоритмов и делает их взаимозаменяемыми, тогда как 
    Команда инкапсулирует запрос в объект.

## Примеры использования в Java
### Callable использует паттерн Command
Интерфейс `Callable` в Java можно рассматривать как реализацию паттерна Command.

#### Обоснование:
- **Инкапсуляция запроса**: `Callable` инкапсулирует задачу (запрос) в объект, который может быть выполнен в будущем.
- **Метод выполнения**: Интерфейс `Callable` имеет метод `call()`, который выполняет инкапсулированную задачу. 
    Это соответствует методу `execute()` в паттерне Command.
- **Отделение инициатора от исполнителя**: Объект, который вызывает метод `call()`, не знает деталей выполнения задачи, 
    что соответствует принципу отделения инициатора от исполнителя в паттерне Command.

### ExecutorService использует паттерн Command
Интерфейс `ExecutorService` в Java можно рассматривать как реализацию паттерна Command.

#### Обоснование:
- **Инкапсуляция запроса**: `ExecutorService` принимает задачи, которые реализуют интерфейсы `Runnable` или `Callable`, 
    инкапсулируя их в объекты.
- **Метод выполнения**: `ExecutorService` предоставляет методы для выполнения задач, такие как `submit()`, `execute()`, 
    которые принимают объекты `Runnable` или `Callable` и выполняют их. Это соответствует методу `execute()` 
    в паттерне Command.
- **Отделение инициатора от исполнителя**: `ExecutorService` отделяет код, который инициирует выполнение задачи, 
    от кода, который выполняет задачу. Это позволяет инициатору не заботиться о деталях выполнения задачи.

