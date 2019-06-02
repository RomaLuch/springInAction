## Spring in Action

### Глава 2

1. Область действи бина (prototype)
    * singleton - создается только один экземплр объекта (по умолчанию)
    * prototype - каждый раз созадетс новый экземпляр объекта
    * request - Область действия компонента ограничивается HTTP-запросом
    * session - Область действия компонента ограничивается HTTP-сеансом
    * global-session - Область действия компонента ограничивается глобальным HTTP-сеансом


### Глава 4

1. Четыре типа автоматического связывания
    * byName – пытается отыскать компонент в контейнере, чье
 имя (или идентификатор) совпадает с именем связываемого свойства.
  Если соответствующий компонент не найден, свойство
останется несвязанным.
Недостаток автоматического связывания по имени – в том, что
предполагается наличие компонента, чей идентификатор совпадает
с именем свойства другого компонента.

    * byType – пытается отыскать единственный компонент в кон-
тейнере, чей тип соответствует типу связываемого свойства.
Если соответствующий компонент не найден, свойство не бу-
дет связано. 
Недостаток связывани по типу в том, что если в контексте будет несколько
бинов с данным типом - спринг бросит исключение. Есть два решения: 
        1. либо определить основного кандидата для автоматического связывания,
            ```xml
            <bean id="saxophone"
            class="com.springinaction.springidol.Saxophone"
            primary="true" />
            ```
            но по умолчанию primary у всех компонентов true :(, поэтому у остальных
            компонентов такого типа придется проставлять primary="false"
        
        2. либо исключить компоненты из списка кандидатов на автоматиче-
ское связывание.
            ```xml
            <bean id="saxophone"
            class="com.springinaction.springidol.Saxophone"
            autowire-candidate="false" />
            ```

    * constructor – пытается сопоставить конструктор компонента,
куда выполняется внедрение, с компонентами, чьи типы со-
впадают с аргументами конструктора.
    * autodetect – сначала пытается выполнить автоматическое свя-
зывание через конструктор, а затем по типу.

2. Связывание через анатацию @Autowire
Если id бина совпадает с именем поля, то не нужен @Qualifier

3. Поиск компонентов context:component-scan можно настраивать,
используя любой из пяти типов фильтров
    ```xml
        <context:component-scan base-package="instruments">
            <context:include-filter type="assignable" expression="instruments.Instrument"/>
            <context:exclude-filter type="assignable" expression="instruments.Piano"/>
            <context:exclude-filter type="assignable" expression="instruments.Guitar"/>
        </context:component-scan>
    
    ```
    * annotation - Отыскивает классы, отмеченные указанной аннотацией
на уровне типа. Аннотация определяется атрибутом expression
    * assignable - Отыскивает классы, экземпляры которого могут присваиваться
свойствам указанного типа. Тип свойств определяется
атрибутом expression
    * aspectj - Отыскивает классы, тип которых соответствует выражению
типа AspectJ, указанному в атрибуте expression
    * custom - Использует пользовательскую реализацию org.springframework.
core.type.TypeFilter, указанную в атрибуте expression
    * regex - Отыскивает классы, имена которых соответствуют регулярному
выражению, указанному в атрибуте expression

#### Глава 5

> Прежде чем начинать делать примеры нужно подключить зависимости

```xml
        <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjrt -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjrt</artifactId>
            <version>1.9.4</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.4</version>
        </dependency>
```


