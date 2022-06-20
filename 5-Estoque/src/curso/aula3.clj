(ns curso.aula3)
(ns curso.aula3)

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 1000))
(println (valor-descontado 100))

;----------------------------------------
(defn aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))


(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (aplicar-desconto?valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto         (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de " desconto)
      (- valor-bruto desconto))
    valor-bruto))


;--------------
;segunda maneira
(defn aplicar-desconto?
  [valor-bruto]
  (if (> valor-bruto 100)
    true))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))

;---------------
;terceira maneira
(defn aplicar-desconto?
  [valor-bruto]
  (> valor-bruto 100))

(println (aplicar-desconto? 1000))
(println (aplicar-desconto? 100))


