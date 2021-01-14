package com.ashypilov.harrypotterquize

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val QUESTIONS: String = "questions"
    const val QUESTIONS_PHRASES: String = "questions_phrases"
    const val QUESTIONS_HARRY_POTTER: String = "questions_harry_potter"
    const val QUESTIONS_HOGWARTS: String = "questions_hogwarts"
    const val QUESTIONS_OTHER: String = "questions_other"



    fun getQuestionsPhrases(): ArrayList<Question> {
        val questionList =  ArrayList<Question>()

        val que1 = Question(1, "Рабский труд. Вот что создало этот ужин — рабский труд",
            "Гермиона", "Рон", "Гарри", "Полумна", 1)
        questionList.add(que1)

        val que2 = Question(2, "Она умела видеть красоту в других, даже тогда, когда человек сам в себе этого не видит",
            "Снейп", "Сириус", "Люпин", "Дамблдор", 3)

        questionList.add(que2)

        val que3 = Question(3, "Значит, надо было умереть. Умереть, а не предавать друзей. Мы бы все так поступили ради тебя!",
            "Гарри", "Сириус", "Люпин", "Тонкс", 2)

        questionList.add(que3)

        val que4 = Question(4, "Позволь лишь сказать, что раздавать фотографии с автографом на этой стадии твоей карьеры — неразумно… честно говоря, Гарри, это выглядит так, будто ты много о себе возомнил",
            "Рита Скитер", "Виктор Крам", "Сириус", "Златопуст Локонс", 4)

        questionList.add(que4)

        val que5 = Question(5, "Когда в небе появляются два Нептуна, мой милый, это верный знак, что рождается маленькая зануда в очках...",
            "Профессор Трелони", "Рон", "Гарри", "Гермиона", 2)

        questionList.add(que5)

        val que6 = Question(6, "Человек умирает тогда, когда умирает последнее воспоминание о нём",
            "Римус Люпин", "Сириус Блек", "Гермиона Грейнджер", "Альбус Дамблдор", 4)

        questionList.add(que6)

        val que7 = Question(7, "Вы думали, что я не захочу за него выйти? Что меня интересует одна его внешность?",
            "Тонкс", "Флер", "Джинни", "Гермиона", 2)

        questionList.add(que7)

        val que8 = Question(8, "Я... не... должен... выглядеть... как... задница... бабуина", "Фред", "Рон", "Гарри", "Гойл", 2)

        questionList.add(que8)

        val que9 = Question(9, "Мозг — сложный и многослойный орган — по крайней мере, у большинства людей...",
            "Снег", "Гермиона", "Сириус", "Люпин", 1)

        questionList.add(que9)

        val que10 = Question(10, "Все, что мы теряем, обязательно к нам вернется, только не всегда так, как мы ожидаем",
            "Полумна", "Проффесор МакГонагалл", "Гарри", "Гермиона", 1)

        questionList.add(que10)

        return questionList
    }

    fun getQuestionsHarry(): ArrayList<Question> {
        val questionList =  ArrayList<Question>()

        val que1 = Question(1, "Почему Дурсли взяли с собой Гарри в зоопарк?",
            "Потому что они добрые", "Потому что у Дадли был день рождение", "Потому что миссис Фиг сломала ногу", "Потому что Гарри их уговорил", 3)
        questionList.add(que1)

        val que2 = Question(2, "Кто разбудил Гарри на следующее утро, после того как приехал Хагрид и сказал, что он волшебник?",
            "Мистер Дурсль", "Хагрид", "Сова", "Ветер", 3)
        questionList.add(que2)

        val que3 = Question(3, "Где в первый раз встретились Гарри и Драко по книге?",
            "Дырявый котел", "Мантии на все случаи жизни Мадам Малкин", "Хогвартс", "Поезд Хогвартс-экспресс", 2)
        questionList.add(que3)

        val que4 = Question(4, "Кто подарил первую метлу Гарри?",
            "Проффесор МакГонагалл", "Дамблдор", "Сириус", "Рон", 3)
        questionList.add(que4)

        val que5 = Question(5, "Что Дурсли подарили Гарри на Рождество?",
            "50 пенсов", "Носки", "Ничего", "Зубочистку", 1)
        questionList.add(que5)

        val que6 = Question(6, "Что подарил Хагрид Гарри на Рождество?",
            "Арфу", "Флейту", "Гитару", "Дудку", 2)
        questionList.add(que6)

        val que7 = Question(7, "Кто помог Гарри затащить чемодан в Хогвартс-экспресс?",
            "Рон", "Хагрид", "Фред и Джордж", "Сам затащил", 3)
        questionList.add(que7)

        val que8 = Question(8, "Кто был комментатором квиддича в первом матче Гарри?",
            "Ли Джордан", "Дин Томас", "Симус Финниган", "Минерва Макгонагал", 1)
        questionList.add(que8)

        val que9 = Question(9, "Чей был урок, когда профессор МакГонагалл пришла показать Оливеру Вуду нового ловца?",
            "Флитвика", "Квирелла", "Снега", "Стебль", 2)
        questionList.add(que9)

        val que10 = Question(10, "В каком году родился Гарри Поттер?",
            "1980", "1981", "1982", "1983", 1)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionsHogwarts(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Какой предмет преподавал Альбус Дамблдор до того как стал директором?",
            "Защиту от Темных искусств", "Трансфигурацию", "Заклинания", "Зелья", 2)
        questionList.add(que1)

        val que2 = Question(2, "Какой фрукт нужно пощекотать, что бы попасть на кухню в Хогвартсе?",
            "Яблоко", "Грушу", "Дыню", "Тыкву", 2)
        questionList.add(que2)

        val que3 = Question(3, "Кто является первым владельцем Сортировочной Шляпы?",
            "Гриффиндор", "Пуффендуй", "Когтевран", "Слизерин", 1)
        questionList.add(que3)

        val que4 = Question(4, "Как зовут кошку Филча?",
            "Миссис Моррис", "Миссис Доррис", "Миссис Норрис", "Миссис Поррис", 3)
        questionList.add(que4)

        val que5 = Question(5, "Что осталось навсегда в Хогвартсе после побега Фреда и Джоржда?",
            "Дыра в стене", "Болото в коридоре", "Незакрывающееся окно", "Периодические фейерверки", 2)
        questionList.add(que5)

        val que6 = Question(6, "Что надо сделать чтобы попасть в гостинную Когтеврана?",
            "Сказать пароль", "Спеть песню", "Решить задачу", "Отгадать загадку", 4)
        questionList.add(que6)

        val que7 = Question(7, "Кто охраняет вход в кабинет директора?",
            "Горгулья", "Мантикора", "Феникс", "Гиппогриф", 1)
        questionList.add(que7)

        val que8 = Question(8, "Кто является призраком факультета Пуффендуй?",
            "Кровавый Барон", "Толстый монах", "Серая дама", "Лорд Драбен", 2)
        questionList.add(que8)

        val que9 = Question(9, "Какой предмет одновременно преподавали два учителя?",
            "Защита от темных искусств", "Прорицания", "Уход за магическимим существами", "История магии", 2)
        questionList.add(que9)

        val que10 = Question(10, "Что находится в Гриффиндорских часах для определения баллов?",
            "Алмазы", "Рубины", "Сапфиры", "Изумруды", 2)
        questionList.add(que10)

        return questionList
    }

    fun getQuestionsOther(): ArrayList<Question> {
        val questionList = ArrayList<Question>()

        val que1 = Question(1, "Какая анимагическая форма у Риты Скитер?",
            "Муха", "Комар", "Жук", "Пчела", 3)
        questionList.add(que1)

        val que2 = Question(2, "Кого убила Беллатриса Лестрейндж?",
            "Сириуса, Добби, Фреда, Тонкс", "Сириуса, Долгопупсов, Люпина", "Сириуса, Добби, Люпина, Долгопупсов", "Сириуса, Колина Криви, Добби", 1)
        questionList.add(que2)

        val que3 = Question(3, "Как зовут кота Гермионы?",
            "Дырокол", "Клюводер", "Живодер", "Живоглот", 4)
        questionList.add(que3)

        val que4 = Question(4, "Какие сережки носила Полумна?",
            "Морковки", "Редиски", "Помидоры", "Огурцы", 2)
        questionList.add(que4)

        val que5 = Question(5, "Что миссис Уизли дарит на Рождество каждый год?",
            "Фруктовый торт", "Новый свитер", "Новые носки", "Деньги", 2)
        questionList.add(que5)

        val que6 = Question(6, "Что сжимал Хагрид в руках у мистера Олливандера?",
            "Буклю", "Зонт", "Шляпу", "Гарри", 2)
        questionList.add(que6)

        val que7 = Question(7, "Кто старше?",
            "Гарри", "Рон", "Гермиона", "Дадли", 3)
        questionList.add(que7)

        val que8 = Question(9, "В каком году Дамблдор победил Грин-де-Вальда?",
            "1940", "1943", "1945", "1947", 3)
        questionList.add(que8)

        val que9 = Question(9, "Где Гарри и Джинни в первый раз поцеловались в книжке?",
            "В гостинной Гриффиндора", "В тайной комнате", "В Норе", "В раздевалке", 1)
        questionList.add(que9)

        val que10 = Question(10, "Кто создал организацию Г.А.В.Н.Э.?",
            "Амбридж", "Гермиона", "Полумна", "Драко", 2)
        questionList.add(que10)

        return questionList
    }
}