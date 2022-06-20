(ns curso.aula6)

(def pedido {:mochila  {:quantidade 2, :preco 80}
             :camiseta {:quantidade 3, :preco 40}})

(defn imprime-e-15 [valor]
  (println "valor" (class valor) valor)
  15)

(println (map imprime-e-15 pedido))                         ; (valor clojure.lang.MapEntry [:mochila {:quantidade 2, :preco 80}]
                                                            ; valor clojure.lang.MapEntry [:camiseta {:quantidade 3, :preco 40}]
                                                            ; 15 15)

;
;(defn imprime-e-15 [chave valor]
; (println chave "e" valor)
; 15)
;
;(println (map imprime-e-15 pedido))

(defn imprime-e-15 [[chave valor]]
  (println chave "<e>" valor)
  15)                                                       ; (:mochila <e> {:quantidade 2, :preco 80}
                                                            ; :camiseta <e> {:quantidade 3, :preco 40}
                                                            ; 15 15)

(println (map imprime-e-15 pedido))

;só para o valor
(defn imprime-e-15 [[chave valor]]
  valor)

(println (map imprime-e-15 pedido))

;pegando o preço dos produtos
(defn preco-dos-produtos [[chave valor]]
  (* (:quantidade valor) (:preco valor)))

(println (map preco-dos-produtos pedido))                   ;preco total individual
(println (reduce + (map preco-dos-produtos pedido)))        ;preco total somando oque tem dentro do map pois o map pega uma soma do conjunto e o reduxe pega toda a soma completa do map

(defn preco-dos-produtos [[_ valor]]
  (* (:quantidade valor) (:preco valor)))                   ;o "_" dis que se tem alguem ai ele não vai usar

(println (reduce + (map preco-dos-produtos pedido)))        ;preco total somando oque tem dentro do map pois o map pega uma soma do conjunto e o reduxe pega toda a soma completa do map

;fazendo todo o processo usando func

(defn total-do-pedido
  [pedido]
  (reduce + (map preco-dos-produtos pedido)))

(println (total-do-pedido pedido))

; função de forma usando threading
(defn total-do-pedido
  [pedido]
  (-> pedido
      (map precisa-dos-produtos ,,,)
      (reduce + ,,,)))                                            ;

(println (total-do-pedido pedido))

;-------------------
(defn preco-total-do-produto [produto]
  (* (:quantidade produto) (:preco produto)))

;THREAD LAST
(defn total-do-pedido
  [pedido]
  (->> pedido
       vals
       (map preco-dos-produtos ,,,)
       (reduce + ,,,)))

---------------------                                       ;filtrando mapas e criando composições com comp
(def pedido {:mochila {:quantidade 2, :preco 80}
             :camisa {:quantidade 3, :preco 40}
             :chaveiro {:quantidade 1}})
(def gratuito?
  [_ item]
  ;(println item)
  (<= (get item :preco 0) 0))

(println " filtrando gratuitos")
(println (filter gratuito? pedido))
(println (filter gratuito? (vals pedido)))
;fazendo de outra forma o chamado
(println (filter (fn [[chave item]] (gratuito? item)) pedido)) ;é uma função anonima mas recebeu parametro então tem "n" ao inves de "#"

(println (filter #(gratuito? (second %)) pedido))


(defn pago?
  [item]
  (not (gratuito? item)))

(println (pago? {:preco 50}))
(println (pago? {:preco 0}))

(println ((comp not gratuito?) {:preco 50}))

(def pago? (comp not gratuito?))
(println (pago? {:preco 50}))
(println (pago? {:preco 0}))





















