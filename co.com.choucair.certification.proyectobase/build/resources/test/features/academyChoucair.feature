# Autor: Brandon
@stories

  Feature: Academy Choucair
    As a user, I want to learn how ro automate in screamplay at the Choucair Academy with the automation course

    @scenario1
    Scenario Outline: Search for a automation course
      Given than brandon wants to learn automation at the academy Choucair
        | strUser   |strPassword   |
        | <strUser> |<strPassword> |

      When he search for the course Recursos Automatizacion Bancolombia on the choucair academy platform
        | strCourse   |
        | <strCourse> |
      Then he finds the course called resources Recursos Automatizacion Bancolombia
        | strCourse   |
        | <strCourse> |

      Examples:
        | srtUser   | strPassword   | strCourse |
        | 1022427734  |  Choucair2021*| Recursos Automatizacion Bancolombia  |