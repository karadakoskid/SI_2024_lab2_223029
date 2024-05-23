# Втора лабораториска вежба по Софтверско инженерство

## Дамјан Карадакоски, бр. на индекс 223029

### Control Flow Graph
![SI_lab2](https://github.com/karadakoskid/SI_2024_lab2_223029/assets/139143748/9b58ba35-b57a-4c4d-b48f-9cb074fdea42)

### Цикломатска комплексност
- 9 предикатни јазли, комплексноста изнесува 10.

### Тест случаи според критериумот Multiple Condition
за условот if (item.getPrice() > 300 && item.getDiscount() > 0 && item.getBarcode().charAt(0) == '0')
-TTT -> item.price = 340; item.discount = 0.4; item.barcode = "0432"

-TTF -> item.price = 340; item.discount = 0.4; item.barcode = "1432"

-TFX -> item.price = 340; item.discount = -0.4; item.barcode = any

-FXX -> item.price = 200; item.discount = any; item.barcode = any

### Објаснување на напишаните Unit Tests
-Unit тестовите за сите cases ги пишував според Control Flow Graph за да ги опфатам сите гранки. Пред да ги напишав тест случаите, во excel ги запишав сите гранки како што правевме на аудиториски.Започнав со наједноставет тест случај каде ке исфрли одма инсклучок, па потоа ги надградував за да ги опфатам сите случаи, и потоа гледав од табелата додека ги пушував во gradle.
