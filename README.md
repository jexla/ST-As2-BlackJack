# Software Testing - Dylan Williams - Assignment 2 - Blackjack

* REQ_1: When the program starts, the message “Welcome to Blackjack!” should be displayed to the console. 

* REQ_2: After the welcome message has been displayed, 2 random numbers from 1 to 6 (inclusive) should be generated and added together and the total displayed to the console.  It should be displayed in the following format "You roll 2 dice and get \<total>". The total should be from 2 to 12 (inclusive).

* REQ_3: After the player's first 2 dice have been rolled, the player should be prompted whether they want to roll again. It should be displayed in the following format "Roll again? Y/N: ".

* REQ_4: Given the roll again prompt is displayed, when the player enters any string beginning with y (not case sensitive), then 2 dice should be rolled again and the total added to the previous total and displayed to the console.

* REQ_5: Given the roll again prompt is displayed, when the player enters any string beginning with n (not case sensitive), then no more dice shall be rolled and the total for the first 2 dice should be displayed to the console.

* REQ_6: Given the roll again prompt is displayed, when the player enters anything other than a string beginning with y or n, then the following message should be displayed "Invalid option: \<input string>". And the player should be prompted again.

* REQ_7: Given that the player has had their turn, then the AI should roll 2 dice and the total should be shown on the console. It should be displayed in the following format "The AI rolls 2 dice and gets \<total>". The total should be from 2 to 12 (inclusive).

* REQ_8: Given that the AI has rolled its first dice, when it is randomly chosen that the AI should roll again, then the AI should roll 2 dice again and the total added to the previous total and displayed to the console.

* REQ_9: Given that the AI has rolled its first dice, when it is randomly chosen that the AI should not roll again, the following message should be displayed to the console "The AI chooses not to roll again". And the total for the first 2 dice should be displayed to the console.

* REQ_10: Given that the AI has finished its turn, when the player has a higher score than the AI, or the AI has more then 21, then the following message should be displayed "You win!"

* REQ_11: Given that the AI has finished its turn, when the AI has a higher score than the player, or the player has more then 21, then the following message should be displayed "AI wins!"

* REQ_12: Given that the AI has finished it's turn, when the player has the same score as the AI or they both have more than 21, then the following message should be displayed "Draw!"

* REQ_13: Given that the player wins message has been displayed, then display the player total and AI total and prompt the player whether or not to play again.

* REQ_14: Given the play again prompt is displayed, when the player enters any string beginning with y (not case sensitive), then restart the program.

* REQ_15: Given the play again prompt is displayed, when the player enters any string beginning with n (not case sensitive), then exit the program.

* REQ_16: Given the play again prompt is displayed, when the player enters anything other than a string beginning with y or n, then the following message should be displayed "Invalid option: \<input string>". And the player should be prompted again.

