(ns curso.aula2)
(defn imprime-mensagem
  []
  (println "-----------------")
  (println "Bem vindo(a) so estoque"))


(imprime-mensagem)

;* valor-bruto 0.9

(defn aplica-desconto [valor-bruto]
  (* valor-bruto 0.9))

(println (aplica-desconto 100))
(defn valor-descontado
  "Retorna o valor decontado que é 90% do valor bruto"
  [balor-bruto]
  (* valor-bruto 0.9))

(valor-descontado 100)

(defn valor-descontado [balor-bruto] (* valor-bruto 0.9))

;--------------
(defn valor-descontado
  "Retorna o valor com desconto de 10%."
  [valor-bruto]
  (* valor-bruto (- 1 0.10)))

(valor-descontado 100)

;Este tipo de pratica é errada
(defn valor-descontado
  "Retorna o valor com desconto de 10%."
  [valor-bruto]
  (def desconto 0.10)
  (* valor-bruto (- 1 desconto)))

(valor-descontado 100)

;Este tipo é a boa pratrica
(defn valor-descontado
  "Retorna o valor com desconto de 10%."
  [valor-bruto]
  (let [desconto 0.10]
    (* valor-bruto (- 1 desconto))))

(defn valor-descontado
  "Retorna o valor com desconto de 10%."
  [valor-bruto]
  (let [desconto 0.10]
    (println "Calculando desconto de" desconto)
    (* valor-bruto (- 1 desconto))))

(class 90N)
(class 90M)

