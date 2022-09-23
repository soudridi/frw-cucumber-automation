Feature: Je verifie la page de la connexion
  En tat que utilisateur je souhaite me connecter au site Mercury

  @register
  Scenario: Je cree un nouveau compte
    Given Je me connecte sur le site Mercury
    When Je clique sur le boutton REGISTER
    Then je me redirige vers la page d inscription
    And Je saisi les champs obligatoire
    And Je clique sur le boutton envoyer
    Then je me redirige vers 