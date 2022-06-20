(ns curso.aula4)

(def precos [30 700 1000])

(println (precos 0 ))
(println (get precos 2 ))
(println (get precos 17 ))
;(println (precos 17))
(println "valor padrão nil" (get precos 17 ))
(println "valor padrão 0" (get precos 17 0 ))
(println "valor padrão 0, mas existe" (get precos 2 0 ))

(println (conj preos 5))

(println precos)

;(println (conj 5 precos))

(println (+ 5 1))
(println (inc 5 ))
(println (update precos 0 inc))                             ;indice 0 ele vai incrementar 1
(println (update precos 1 dec))                              ;indice 1 ele vai descrecer 1

(defn soma-3
  [valor]
  (println "estousomando um em" valor)
  (+ valor 3))

(println (update precos 0 soma-3))


---------------------------------------------
(defn aplica-desconto?
  [valor-bruto]
  (> valor-bruto 100))
(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente amior que 100."
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

;(println precos)
(println  "map" (map valor-descontado precos))              ;passa por todos os elementos

(println (range 10))
(println (filter even? (range 10)))                         ;even é se o valor é par

(println "vetor" precos)
(println "filter" (filter aplica-desconto? precos))         ;está filtrando todos os valores que vão aplicar desconto

(println "map apos o filter" (map valor-descontado (filter aplica-desconto? precos)) )    ;está filtrando todos os valores descontados


------------- ;reduce e variações
(println "vetor" precos)
(println (reducve + precos))

(def minha-soma
  [valor-1 valor-2]
  (println "Somando" valor-1 valor-2)
  (+ valor-1 valor-2))

(println (reduce minha-soma precos))                        ;ele reduz uma sequencia a um unico valor
(println (reduce minha-soma (range 10)))

(println (reduce minha-soma 0 []))                          ;O 0 é um valor inicial para o inicio da soma





