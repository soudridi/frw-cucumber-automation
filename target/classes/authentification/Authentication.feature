Feature: Je verifie la page de la connexion
  En tat que utilisateur je souhaite me connecter au site Mercury

  @connexion
  Scenario: Je verifie la page de la connexion
    Given Je me connecte sur le site Mercury
    When Je saisie le username "Test"
    And Je saisie le mot de passe "Test"
    And Je clique sur le boutton submit
    Then Je me redirige vers la page home "Login Successfully"

    
    