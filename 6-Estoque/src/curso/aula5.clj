(ns curso.aula5)
(def estoque {"Mochila" 10 "Camiseta" 5})                   ;definição de um hashmap é as chaves
(println estoque)

(def estoque {"Mochila"  10,
              "Camiseta" 5})

(def estoque {"Mochila" 10, "Camiseta" 5})
(println estoque)

(println "Temos" (count estoque) "elementos")
(println "Chaves são:" (keys estoque))                      ;as Keys vão lhe trazer oque tem de String dentro de estoque que é  Mochila e Camiseta
(println "Valores são:" (vals estoque))                     ;as Vals trazem os valores dentro de estoque que são 10 e 5

;keyword
; :mochila
(def estoque {:mochila  10
              :camiseta 5})

(println (assoc estoque :cadeira 3))
(println estoque)
(println (assoc estoque :mochila 1))                        ;Assoc inclui na lista

(println estoque)
(update estoque :mochila inc)

(defn tira-um
  [valor]
  (println "tirando um de " valor)
  (- valor 1))
(println estoque)
(println (update estoque :mochila tira-um))
(println (update estoque :mochila #(- #3)))
(println (update estoque :mochila #(- % 3)))                ;Update faz uma atualização do sistema

;-------------------------
;Mapas aninhados update-in threading first
(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

(println "\n\n\n\n")
(println pedido)

(def pedido (assoc pedido :chaveiro {:quantidade 1, :preco 10}))

(println pedido)
(println (pedido :mochila))                                 ;mapa como função vai lhe retornar {:quantidade 2, :preco 80
(println (get pedido :mochila))                             ;vai çlhe retornar  {quantiade 2,, preco 80
(println (get pedido :cadeira))                            ;nil
(println (get pedido :cadeira {}))                          ;vai lhe retornar o parametro {} que vc colocou como escape
(println (:mochila pedido))                                 ;vai lhe reotnar oque tem dentro de mochila na funcao pedido que sereia {:quantidade, :preco 80}
(println (:cadeira pedido))                                 ;vi lhe retornar oque tem dentro de cadeira na funcao pedido qe noc aso não existe e vai ser nil
(println (:cadeira pedido {}))

(println (:quntidade (:mochila pedido)))                    ;vai me retornar a quantidade de mochila que rem dentro de pedido

(println (update-in pedido [:mochila :quantidade] inc))

;THREADING FIRST
(println (-> pedido
             :mochila
              :quantidade ))                                ;pedido pega mochila e pega quantidade, essa é a forma que a threading trabalha no clojure


(-> pedido:mochila ,,,
    :quantidade ,,,
    println ,,,)                                            ;os ",,,' ~sao a demosntração que vai passar o resultado aqui

