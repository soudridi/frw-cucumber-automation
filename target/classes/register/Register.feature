Feature: Je verifie la page de la connexion
  En tat que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: Je verifie la page de la connexion
    Given Je me connecte sur le site Mercury
    When Je clique sur le boutton REGISTER
    Then je me redirige vers la page d inscription
    And Je saisi les champs obligatoire
    Then Je clique sur le boutton envoyer