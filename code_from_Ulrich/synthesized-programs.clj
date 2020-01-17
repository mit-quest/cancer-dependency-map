(define labelled-categorical
    (gen [p  categories]
        (define index (categorical p))
        (nth categories index)))

(define data-generating-process-model-0
    (gen []
            ;; Column grouping for view: araC, arabinose
        (define cluster-id-for-araC-arabinose
            (categorical [0.599820 0.287668 0.031969 0.028648 0.051894]))
        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araC-arabinose 0) [7.826715 0.634979]
                (= cluster-id-for-araC-arabinose 1) [9.098689 0.566170]
                (= cluster-id-for-araC-arabinose 2) [13.358851 0.743700]
                (= cluster-id-for-araC-arabinose 3) [9.722386 0.454566]
                (= cluster-id-for-araC-arabinose 4) [8.286779 0.674934]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araC-arabinose 0) [0.075230 1.020788]
                (= cluster-id-for-araC-arabinose 1) [8.183678 0.864407]
                (= cluster-id-for-araC-arabinose 2) [16.700481 1.154188]
                (= cluster-id-for-araC-arabinose 3) [0.004572 0.996753]
                (= cluster-id-for-araC-arabinose 4) [16.417631 0.732904]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))



        ;; Column grouping for view: araB, araA, araD
        (define cluster-id-for-araB-araA-araD
            (categorical [0.041991 0.231195 0.442658 0.190387 0.019732 0.012312 0.041991 0.019732]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [13.535197 0.141017]
                (= cluster-id-for-araB-araA-araD 1) [13.032038 0.160744]
                (= cluster-id-for-araB-araA-araD 2) [8.142710 0.161412]
                (= cluster-id-for-araB-araA-araD 3) [8.482632 0.185452]
                (= cluster-id-for-araB-araA-araD 4) [12.674286 0.269735]
                (= cluster-id-for-araB-araA-araD 5) [7.776979 0.222701]
                (= cluster-id-for-araB-araA-araD 6) [8.846158 0.273437]
                (= cluster-id-for-araB-araA-araD 7) [9.132385 0.191926]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [13.604784 0.157421]
                (= cluster-id-for-araB-araA-araD 1) [13.109339 0.122977]
                (= cluster-id-for-araB-araA-araD 2) [8.038566 0.214505]
                (= cluster-id-for-araB-araA-araD 3) [8.519169 0.157466]
                (= cluster-id-for-araB-araA-araD 4) [12.926935 0.239490]
                (= cluster-id-for-araB-araA-araD 5) [7.386577 0.375161]
                (= cluster-id-for-araB-araA-araD 6) [9.025508 0.185689]
                (= cluster-id-for-araB-araA-araD 7) [9.088934 0.214033]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [12.396624 0.141561]
                (= cluster-id-for-araB-araA-araD 1) [12.331334 0.137850]
                (= cluster-id-for-araB-araA-araD 2) [8.434918 0.190209]
                (= cluster-id-for-araB-araA-araD 3) [8.837352 0.197456]
                (= cluster-id-for-araB-araA-araD 4) [11.783416 0.228923]
                (= cluster-id-for-araB-araA-araD 5) [8.101997 0.114559]
                (= cluster-id-for-araB-araA-araD 6) [9.155274 0.134482]
                (= cluster-id-for-araB-araA-araD 7) [9.256686 0.250275]))
        (define araD
            (gaussian araD-mean araD-std))



        ;; Column grouping for view: glucose
        (define cluster-id-for-glucose
            (categorical [0.665076 0.071362 0.145576 0.085498 0.032488]))
        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-glucose 0) [-0.120829 0.897599]
                (= cluster-id-for-glucose 1) [0.692516 0.670396]
                (= cluster-id-for-glucose 2) [11.590116 1.072039]
                (= cluster-id-for-glucose 3) [5.350887 0.966338]
                (= cluster-id-for-glucose 4) [20.981452 0.958606]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-1
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.307320 0.000456 0.218980 0.074847 0.000456 0.000456 0.125991 0.046951 0.019054 0.200382 0.005106]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.032813 0.188144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.607167 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.161479 0.162903]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.928074 0.196667]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [12.449026 0.305201]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.175902 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.581937 0.145357]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.112589 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.190392 0.166134]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.391792 0.183203]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.365061 0.198054]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.202751 0.507540]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [9.496913 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.366106 0.594204]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.829780 0.856478]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.407913 0.501231]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.002889 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.808327 0.521371]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [11.200282 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.573993 0.665185]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [7.895317 0.358841]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.322119 0.242078]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.092526 0.175966]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.508304 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.892610 0.205037]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.718594 0.185135]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [12.777763 0.272184]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.192939 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.383156 0.166104]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.989684 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.915102 0.232744]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.298572 0.227820]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.891779 0.302872]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.271283 0.157570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [11.609859 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.350071 0.166421]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.221167 0.143022]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [11.924223 0.284887]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.348412 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.995284 0.171835]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.515004 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.041450 0.154120]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.515710 0.134278]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [9.402128 0.183025]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.224003 0.879777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.122022 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.261098 0.852861]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.432160 1.169284]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [16.168655 0.349587]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.159014 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.298289 0.896435]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [16.473239 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.291719 1.059031]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [0.004939 1.059233]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [0.385075 0.986473]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.105964 0.880588]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.516532 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [14.307375 4.341106]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.148476 0.956219]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [-0.249512 0.521876]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.454817 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [2.616814 3.026268]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.425549 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [3.398721 2.652452]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [0.257270 0.926477]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [22.193667 3.329394]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-2
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.290091 0.150283 0.005483 0.000490 0.210201 0.045428 0.000490 0.000490 0.160270 0.020462 0.085373 0.010476 0.020462]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.061882 0.164223]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.627957 0.163047]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.804606 0.198054]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [12.421496 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.292427 0.175339]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.209761 0.099613]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.965824 0.052280]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.129221 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.040337 0.173754]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.267942 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.095001 0.251562]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [13.447903 0.165427]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [9.155848 0.130900]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.011572 0.320118]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.952545 0.520138]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.629254 0.242078]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [10.066311 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.890617 0.361975]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.075435 0.333834]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.188954 0.124759]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.669767 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.508402 0.628100]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [13.060012 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.720116 0.800783]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [10.135572 0.296649]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [9.252595 0.600879]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.028107 0.138370]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.468362 0.190603]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.786355 0.302872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [12.250472 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.287840 0.200532]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.208511 0.155844]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.183841 0.067409]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.952250 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.058426 0.219757]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [7.981700 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.939153 0.190649]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [13.480081 0.145509]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [8.867612 0.266635]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.271345 0.139883]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.969887 0.184195]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [9.125565 0.183025]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [11.405542 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.529030 0.149212]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.430957 0.171083]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.493314 0.092270]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.344908 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.388693 0.160465]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.417196 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.219811 0.145372]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [12.213564 0.169018]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [9.108956 0.189470]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.177022 0.923215]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [-0.131538 0.806345]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.259987 0.986473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.932748 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.207803 1.051611]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.458672 0.961963]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [16.901998 0.673190]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.597010 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.034076 0.776880]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [16.447476 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [-0.030422 1.500023]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.118786 0.357360]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [0.316048 1.066786]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.048237 0.834431]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [2.433805 2.996565]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [22.453343 3.329394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.002720 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.120553 0.920627]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [20.876187 1.572914]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.293558 1.033946]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-1.179509 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [11.531898 1.017147]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.567978 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [-0.316812 0.947706]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [-0.482115 1.174398]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [4.477836 2.053865]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-3
    (gen []
            ;; Column grouping for view: araC, arabinose
        (define cluster-id-for-araC-arabinose
            (categorical [0.285422 0.607103 0.007302 0.000600 0.030757 0.050863 0.003951 0.014003]))
        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araC-arabinose 0) [9.136048 0.569442]
                (= cluster-id-for-araC-arabinose 1) [7.877456 0.665094]
                (= cluster-id-for-araC-arabinose 2) [8.239445 0.324383]
                (= cluster-id-for-araC-arabinose 3) [8.733458 20.930009]
                (= cluster-id-for-araC-arabinose 4) [13.270161 0.743700]
                (= cluster-id-for-araC-arabinose 5) [8.358318 0.674934]
                (= cluster-id-for-araC-arabinose 6) [11.582934 0.115716]
                (= cluster-id-for-araC-arabinose 7) [10.186476 0.424308]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araC-arabinose 0) [8.194365 0.848092]
                (= cluster-id-for-araC-arabinose 1) [0.078976 1.029163]
                (= cluster-id-for-araC-arabinose 2) [0.450560 0.815356]
                (= cluster-id-for-araC-arabinose 3) [6.470480 9.770754]
                (= cluster-id-for-araC-arabinose 4) [16.712293 1.154188]
                (= cluster-id-for-araC-arabinose 5) [16.458408 0.732904]
                (= cluster-id-for-araC-arabinose 6) [5.669155 0.041753]
                (= cluster-id-for-araC-arabinose 7) [0.313624 0.748007]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))



        ;; Column grouping for view: araB, araA, araD
        (define cluster-id-for-araB-araA-araD
            (categorical [0.240258 0.232902 0.405779 0.037955 0.001173 0.008529 0.004851 0.041633 0.026920]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [13.030028 0.166640]
                (= cluster-id-for-araB-araA-araD 1) [8.509484 0.197412]
                (= cluster-id-for-araB-araA-araD 2) [8.135216 0.146639]
                (= cluster-id-for-araB-araA-araD 3) [13.466948 0.174105]
                (= cluster-id-for-araB-araA-araD 4) [11.750494 0.243850]
                (= cluster-id-for-araB-araA-araD 5) [12.814848 0.218184]
                (= cluster-id-for-araB-araA-araD 6) [12.247158 0.423925]
                (= cluster-id-for-araB-araA-araD 7) [9.306354 0.183695]
                (= cluster-id-for-araB-araA-araD 8) [7.575489 0.238788]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [13.093556 0.134640]
                (= cluster-id-for-araB-araA-araD 1) [8.524163 0.196026]
                (= cluster-id-for-araB-araA-araD 2) [7.991592 0.191523]
                (= cluster-id-for-araB-araA-araD 3) [13.513530 0.168302]
                (= cluster-id-for-araB-araA-araD 4) [12.441610 0.047251]
                (= cluster-id-for-araB-araA-araD 5) [12.789975 0.116064]
                (= cluster-id-for-araB-araA-araD 6) [11.967692 0.160955]
                (= cluster-id-for-araB-araA-araD 7) [9.172596 0.260295]
                (= cluster-id-for-araB-araA-araD 8) [7.553579 0.344232]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [12.283833 0.146472]
                (= cluster-id-for-araB-araA-araD 1) [8.839971 0.234785]
                (= cluster-id-for-araB-araA-araD 2) [8.444631 0.186011]
                (= cluster-id-for-araB-araA-araD 3) [12.560492 0.149266]
                (= cluster-id-for-araB-araA-araD 4) [11.129308 0.058949]
                (= cluster-id-for-araB-araA-araD 5) [11.638144 0.187625]
                (= cluster-id-for-araB-araA-araD 6) [11.114095 0.066973]
                (= cluster-id-for-araB-araA-araD 7) [9.170721 0.190675]
                (= cluster-id-for-araB-araA-araD 8) [7.868294 0.129773]))
        (define araD
            (gaussian araD-mean araD-std))



        ;; Column grouping for view: glucose
        (define cluster-id-for-glucose
            (categorical [0.742495 0.082716 0.050792 0.082716 0.022414 0.018867]))
        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-glucose 0) [-0.059579 0.907434]
                (= cluster-id-for-glucose 1) [11.424787 1.208243]
                (= cluster-id-for-glucose 2) [11.517756 0.818837]
                (= cluster-id-for-glucose 3) [5.406350 0.966338]
                (= cluster-id-for-glucose 4) [21.910490 0.986768]
                (= cluster-id-for-glucose 5) [19.520040 0.722904]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-4
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.260260 0.040455 0.045450 0.055441 0.005486 0.000490 0.220295 0.000490 0.165344 0.090410 0.050446 0.065433]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.056819 0.149290]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.318907 0.230248]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.197248 0.252698]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.926770 0.259754]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.065772 0.187859]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.244090 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.280441 0.159678]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [12.343797 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.108569 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.810032 0.200382]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.239882 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [7.951325 0.231656]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.888841 0.246287]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [10.065227 0.538325]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.521369 0.202968]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.220196 0.457094]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.118158 0.434248]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.321626 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.864965 0.430672]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [10.064719 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.572937 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.045790 0.699211]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [10.927332 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.982160 0.856417]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.085569 0.123744]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.395358 0.160649]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [6.956139 0.072560]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.746497 0.211176]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.233832 0.233345]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.060576 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.374203 0.217079]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [12.246572 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.094629 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.630406 0.200254]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.047549 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [7.937895 0.190680]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.266534 0.140031]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.314734 0.175021]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.832632 0.050418]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.116741 0.169461]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.622686 0.238465]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.161057 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.496392 0.133670]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [11.260308 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.279345 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.703878 0.168806]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.620542 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.224692 0.151451]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.120017 0.926894]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.465973 0.512137]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.611827 0.454401]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.332437 0.912450]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.103954 1.097068]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.908998 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.071431 1.085741]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.282935 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.018717 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.037235 0.914405]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [16.683233 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [0.303186 1.419872]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.110106 0.845351]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [-0.075986 0.970237]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-1.806947 0.381486]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [5.938325 0.827383]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [4.444944 0.799115]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.583519 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.190297 0.908466]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.319958 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [11.582943 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.043556 0.742719]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [-0.482725 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [-0.662251 0.910721]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-5
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.348361 0.180891 0.031363 0.031363 0.007439 0.049306 0.001458 0.150985 0.198834]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.089266 0.155187]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.197852 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.599899 0.151057]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.304880 0.096316]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.013679 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.953136 0.247950]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [9.083130 0.137756]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.763741 0.211057]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.212497 0.140370]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.096410 0.419768]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.520132 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.543038 0.233675]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.332651 0.331543]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [13.136732 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.067911 0.790858]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.554882 0.440795]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.253426 0.623028]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.753295 0.467379]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.088268 0.147266]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.942385 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.480102 0.185731]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.881861 0.145955]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.760877 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.952854 0.168849]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [9.157515 0.279586]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.555411 0.177318]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.201555 0.180595]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.359258 0.141427]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.487273 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.970310 0.182744]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.449913 0.164102]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.686488 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.200726 0.140482]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [9.134117 0.174382]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.862115 0.222414]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.495684 0.129431]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.156118 0.888657]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.026810 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.375069 0.840640]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.400006 0.990681]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [16.549295 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.412294 1.378632]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.316540 1.109464]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.044522 1.029842]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.022033 1.080306]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.117035 0.848011]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [11.647320 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [5.535826 0.832655]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [21.253877 1.332441]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [-0.608906 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.376217 0.991452]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [5.161339 1.132006]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.159649 0.721682]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.123113 1.006525]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-6
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.233113 0.009113 0.013042 0.013042 0.185955 0.024832 0.158446 0.213464 0.005183 0.052341 0.056271 0.016972 0.005183 0.013042]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.093112 0.153791]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.499065 0.383419]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [12.278021 0.305201]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.092728 0.252698]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.234567 0.167175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [13.299181 0.179926]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.739125 0.237209]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [6.969056 0.256875]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.055734 0.179291]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [13.684745 0.093312]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.141339 0.295682]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.551444 0.198054]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [13.119972 0.186257]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [12.258534 0.105475]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.088489 0.268965]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [9.965221 0.270380]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [9.153788 0.501231]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.155771 0.202968]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.040845 0.411086]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [10.037783 0.280161]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.230379 0.621527]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [5.735052 0.069505]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.448098 0.557148]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.788579 0.469246]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.792010 0.066995]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.386405 0.242078]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [10.791047 1.223748]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [9.159240 0.691540]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.153615 0.134263]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.338630 0.256028]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [12.865701 0.272184]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [6.495905 0.072560]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.267740 0.209853]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [13.349732 0.153293]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.613353 0.210314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [5.942959 0.419490]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.997286 0.173052]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [13.355232 0.091596]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.028760 0.053815]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.817616 0.302872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [12.874602 0.135188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [12.123517 0.240225]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.292773 0.136206]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [11.338903 0.185930]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [12.293433 0.284887]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.454072 0.050418]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.552059 0.156512]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [12.400734 0.172640]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.876999 0.192034]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.290657 0.144110]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.408863 0.177304]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [12.365849 0.115063]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.958961 0.159632]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.958400 0.183025]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [11.635836 0.214492]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [10.706185 0.094550]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.166454 0.933372]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.704493 0.599636]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [16.164913 0.349587]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.723225 0.454401]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.011764 1.118997]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.419102 0.351714]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.156891 0.873114]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.514177 0.780441]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.273226 0.858028]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.003368 0.574337]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [0.782066 0.940659]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [0.361220 0.986473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [6.318970 0.920171]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [7.441000 0.240416]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.077996 0.813018]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.550696 0.480981]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.193123 0.521876]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-1.062460 0.381486]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.147706 0.945394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.053402 1.169734]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [2.958779 3.367765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [10.769099 0.251239]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [14.438377 7.828041]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [0.024873 0.425979]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [10.135538 0.996017]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [22.369816 3.329394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [2.624732 2.808553]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [0.076248 0.231182]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-7
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose
        (define cluster-id-for-araB-araC-araA-araD-arabinose
            (categorical [0.025071 0.258212 0.403924 0.241559 0.004255 0.008418 0.041724 0.008418 0.008418]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [7.961597 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [13.092195 0.166604]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.135214 0.052280]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.568376 0.189041]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [12.987506 0.273387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.201683 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.182905 0.170006]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [9.237523 0.183695]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.850466 9.988630]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [13.704534 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [9.122253 0.367234]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.646528 0.124759]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [7.974105 0.462157]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [9.049275 0.460904]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.301747 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [7.716218 0.838786]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [8.345429 0.671205]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.334990 30.799165]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [7.538483 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [13.166892 0.142324]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.006845 0.067409]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.497205 0.181880]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [12.758330 0.174569]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.169016 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [7.968839 0.211392]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [8.990249 0.260295]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [10.286006 9.932240]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [9.072055 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [12.303120 0.138800]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.455674 0.092270]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.851033 0.228357]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [12.460970 0.243819]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.634887 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.401734 0.161816]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [9.295671 0.190675]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [9.791191 10.855920]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [16.498885 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.199807 0.910824]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [16.856187 0.673190]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [-0.029986 0.970773]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [15.735361 0.314556]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [7.832934 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [0.205378 0.993343]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [0.472857 1.041617]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [-0.576285 8.039214]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))



        ;; Column grouping for view: glucose
        (define cluster-id-for-glucose
            (categorical [0.051908 0.129648 0.011187 0.770075 0.029697 0.007485]))
        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-glucose 0) [4.942598 0.825374]
                (= cluster-id-for-glucose 1) [11.675405 0.987119]
                (= cluster-id-for-glucose 2) [5.707174 0.988747]
                (= cluster-id-for-glucose 3) [-0.057192 0.907434]
                (= cluster-id-for-glucose 4) [21.528961 0.927982]
                (= cluster-id-for-glucose 5) [17.267870 9.073890]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-8
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.282142 0.227787 0.054840 0.020250 0.000485 0.069664 0.148725 0.005426 0.015309 0.000485 0.000485 0.000485 0.015309 0.158608]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.054930 0.165519]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.401559 0.178504]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.142063 0.192314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.177491 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.250476 0.052280]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.877156 0.239955]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.619879 0.212474]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.597481 0.198054]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [13.223092 0.179926]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.452468 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [12.695437 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [12.742012 0.305201]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [9.131181 0.158400]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [8.176209 0.173754]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.024595 0.283872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.141350 0.366926]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.228419 0.320552]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [13.505728 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.034410 0.124759]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.775598 0.831862]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.282714 0.513015]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.864513 0.242078]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [10.622086 0.280161]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.117963 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [9.513982 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.928510 0.501231]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [8.682738 0.585672]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [7.338755 0.628100]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.108297 0.138558]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.209881 0.214292]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.658240 0.172003]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.811991 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.066917 0.067409]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.808008 0.186924]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.606063 0.198478]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.806013 0.302872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [13.533464 0.153293]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.189337 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [12.496457 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [12.979885 0.272184]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [9.094053 0.269066]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [7.926195 0.219757]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.278991 0.140988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.524290 0.156468]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.299670 0.215882]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.743365 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.381863 0.092270]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.333368 0.151948]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.897525 0.171144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [9.046018 0.183025]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [12.470407 0.172640]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.453595 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [11.458148 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [12.060401 0.284887]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [9.052438 0.166459]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [8.388495 0.160465]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.177418 0.928595]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.063935 1.118018]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.466493 0.911629]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [16.591675 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [16.851034 0.673190]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.268263 1.378133]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.156031 0.835347]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.483182 0.986473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.410034 0.351714]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.184347 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.040706 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [16.105475 0.349587]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [0.687542 0.964448]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [0.042977 0.776880]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.148904 0.822498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.128137 0.910921]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [23.457505 7.685346]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.545801 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [-0.512441 1.033946]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.526543 0.970474]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [2.626915 3.086104]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [22.121646 3.329394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.090397 1.169734]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.688000 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [0.237021 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [-0.436045 0.521876]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [3.453034 2.124528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 13) [11.708061 1.017147]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-9
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose
        (define cluster-id-for-araB-araC-araA-araD-arabinose
            (categorical [0.012660 0.005031 0.008846 0.031734 0.348353 0.218653 0.039363 0.005031 0.050807 0.008846 0.050807 0.214839 0.005031]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.179701 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [13.783846 0.093312]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [12.833812 0.174626]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [13.349320 0.179710]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.169200 0.138202]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [13.100411 0.135386]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [9.614754 10.005862]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [6.638161 0.192278]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.049265 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [12.725886 0.273387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 10) [7.753379 0.204506]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 11) [8.531749 0.184634]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 12) [9.169491 0.263748]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [7.615116 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.323987 0.469246]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [11.021513 1.364134]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [10.077746 0.573137]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [7.755229 0.781243]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [9.099888 0.267720]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [6.543744 40.935235]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [9.818666 0.138285]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [10.983885 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [8.699245 0.460904]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 10) [7.931739 1.195122]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 11) [7.951392 0.456536]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 12) [8.726945 0.691850]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [7.747060 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [13.928117 0.091596]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [12.804308 0.200627]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [13.384644 0.140398]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.021283 0.191583]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [13.095118 0.122041]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.168840 9.942089]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [7.121095 0.232290]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [7.721448 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [12.773987 0.174569]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 10) [7.596342 0.297416]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 11) [8.461870 0.163775]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 12) [9.005858 0.285014]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.517472 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [12.252998 0.115063]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [11.711755 0.241590]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [12.565128 0.158406]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.365159 0.159089]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [12.286148 0.136637]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.996759 10.844038]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [9.137816 0.051148]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.691706 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [11.859703 0.243819]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 10) [8.186601 0.151177]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 11) [8.763066 0.220289]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 12) [9.305772 0.243912]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.237425 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [0.324510 0.574337]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [6.475939 1.123033]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.513850 0.525488]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [0.078465 0.936893]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.127387 0.927771]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [15.005287 8.809099]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [-0.818365 0.495048]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [16.689498 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [15.826255 0.314556]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 10) [0.244090 1.627780]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 11) [-0.047655 0.954810]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 12) [0.336824 1.079149]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))



        ;; Column grouping for view: glucose
        (define cluster-id-for-glucose
            (categorical [0.726194 0.009584 0.085380 0.023365 0.019920 0.002694 0.130168 0.002694]))
        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-glucose 0) [-0.032963 0.907434]
                (= cluster-id-for-glucose 1) [19.977383 0.643425]
                (= cluster-id-for-glucose 2) [5.320143 0.966338]
                (= cluster-id-for-glucose 3) [20.379343 1.317492]
                (= cluster-id-for-glucose 4) [22.187199 1.167097]
                (= cluster-id-for-glucose 5) [44.408319 1.637382]
                (= cluster-id-for-glucose 6) [18.038304 9.046210]
                (= cluster-id-for-glucose 7) [13.072871 0.312863]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-10
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.198235 0.153741 0.020260 0.287222 0.173516 0.074641 0.005429 0.010373 0.020260 0.000485 0.000485 0.000485 0.054866]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.247053 0.172615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.744868 0.177846]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.049532 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [13.170571 0.164271]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.079553 0.198812]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.089201 0.255556]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.578433 0.198054]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [13.079174 0.156198]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.016670 0.146443]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.163266 0.052280]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.900738 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [12.590152 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [8.097213 0.146611]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.861054 0.356457]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.029820 0.550130]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [13.778442 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.031595 0.318101]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [6.935642 0.397765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.240692 0.730556]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.555594 0.242078]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [10.134617 0.295605]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.524527 0.548541]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [7.535855 0.124759]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.767838 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [9.161945 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [7.997435 0.385265]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.242096 0.215386]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.614777 0.181745]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.961780 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [13.059354 0.137994]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.891694 0.171490]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.805963 0.194609]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.837343 0.302872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [13.590145 0.139277]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.975356 0.244700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.054537 0.067409]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.109114 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [12.534932 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [8.016122 0.298790]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.579419 0.137806]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.959979 0.170801]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.702936 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [12.233039 0.139886]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.342838 0.181068]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.290305 0.165463]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [9.250665 0.183025]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [12.352307 0.168337]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.342787 0.184444]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.518034 0.092270]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.204216 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [11.284296 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [8.254835 0.184911]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.080965 1.089562]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [-0.280624 0.893850]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [16.568939 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.189438 0.922521]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.166902 0.880880]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.303638 1.311046]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.401274 0.986473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.459773 0.304938]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.266415 1.042263]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [16.624764 0.673190]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.186024 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.247531 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [0.450929 0.844245]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.090725 0.835065]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [2.489041 2.792707]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.590056 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.050005 0.844324]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [16.100496 8.408192]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.090272 1.163534]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [21.544154 3.329394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.039957 0.963417]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [3.331064 2.205136]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.660024 1.033946]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [-0.694952 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [0.596797 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 12) [11.381805 0.829963]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-11
    (gen []
            ;; Column grouping for view: glucose
        (define cluster-id-for-glucose
            (categorical [0.008405 0.026530 0.099028 0.008405 0.008405 0.146152 0.196901 0.421645 0.084528]))
        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-glucose 0) [20.676408 0.787352]
                (= cluster-id-for-glucose 1) [-0.093213 0.819850]
                (= cluster-id-for-glucose 2) [5.387144 0.966338]
                (= cluster-id-for-glucose 3) [44.175133 1.637382]
                (= cluster-id-for-glucose 4) [18.800953 0.930461]
                (= cluster-id-for-glucose 5) [11.484007 1.072039]
                (= cluster-id-for-glucose 6) [-2.543145 8.317863]
                (= cluster-id-for-glucose 7) [22.736314 0.791633]
                (= cluster-id-for-glucose 8) [0.412709 0.907865]))
        (define glucose
            (gaussian glucose-mean glucose-std))



        ;; Column grouping for view: araB, araC, araA, araD, arabinose
        (define cluster-id-for-araB-araC-araA-araD-arabinose
            (categorical [0.000456 0.256293 0.372582 0.056275 0.000456 0.019063 0.256293 0.019063 0.000456 0.019063]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [7.874119 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.573918 0.181439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [9.615456 9.981244]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [7.773368 0.259895]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.055868 0.252698]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [11.805159 0.257562]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [9.175247 0.195979]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [7.463448 0.401389]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [13.242743 0.198098]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [12.546388 0.397221]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [9.204462 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.222077 0.465648]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.658483 37.003284]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.642240 1.137275]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [7.283412 0.202968]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.041202 0.043756]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.030073 0.753173]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [7.244343 0.170946]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [10.186424 0.552925]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [9.828726 0.106848]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [7.736794 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.540233 0.174141]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [9.259092 9.923702]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [7.859934 0.177042]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [6.669803 0.072560]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [12.077572 0.242241]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.975529 0.190466]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [7.122751 0.248293]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [13.318195 0.169777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [12.189116 0.049084]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.350683 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.899219 0.229859]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.508547 9.834585]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.158352 0.159841]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [7.759899 0.050418]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [11.202753 0.239075]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [9.226395 0.133608]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [9.225958 0.133112]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [12.342771 0.188546]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [11.144999 0.206333]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.026193 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [-0.049205 0.987295]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [15.152632 7.994562]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [-0.017674 1.000745]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [-0.606986 0.454401]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [17.260164 0.358465]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [0.558238 1.056755]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [0.320284 1.190923]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.391714 0.493233]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 9) [8.982963 0.443693]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-12
    (gen []
            ;; Column grouping for view: araB, araA, araD
        (define cluster-id-for-araB-araA-araD
            (categorical [0.019301 0.203775 0.261424 0.015458 0.003928 0.403623 0.061576 0.026987 0.003928]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [13.456414 0.145046]
                (= cluster-id-for-araB-araA-araD 1) [8.504392 0.197743]
                (= cluster-id-for-araB-araA-araD 2) [13.051022 0.184721]
                (= cluster-id-for-araB-araA-araD 3) [10.289451 9.973125]
                (= cluster-id-for-araB-araA-araD 4) [12.865768 0.218184]
                (= cluster-id-for-araB-araA-araD 5) [8.172546 0.145041]
                (= cluster-id-for-araB-araA-araD 6) [6.741751 0.401389]
                (= cluster-id-for-araB-araA-araD 7) [9.255447 0.296283]
                (= cluster-id-for-araB-araA-araD 8) [9.268650 0.163713]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [13.618038 0.143315]
                (= cluster-id-for-araB-araA-araD 1) [8.531835 0.166405]
                (= cluster-id-for-araB-araA-araD 2) [13.172745 0.140748]
                (= cluster-id-for-araB-araA-araD 3) [9.050716 9.909755]
                (= cluster-id-for-araB-araA-araD 4) [12.740362 0.116064]
                (= cluster-id-for-araB-araA-araD 5) [8.040348 0.194622]
                (= cluster-id-for-araB-araA-araD 6) [6.830215 0.248293]
                (= cluster-id-for-araB-araA-araD 7) [8.861607 0.185724]
                (= cluster-id-for-araB-araA-araD 8) [9.388816 0.116912]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [12.479121 0.135582]
                (= cluster-id-for-araB-araA-araD 1) [8.828461 0.224117]
                (= cluster-id-for-araB-araA-araD 2) [12.216537 0.153821]
                (= cluster-id-for-araB-araA-araD 3) [9.187173 10.862577]
                (= cluster-id-for-araB-araA-araD 4) [11.703810 0.187625]
                (= cluster-id-for-araB-araA-araD 5) [8.433864 0.185496]
                (= cluster-id-for-araB-araA-araD 6) [9.158594 0.133112]
                (= cluster-id-for-araB-araA-araD 7) [9.099024 0.136182]
                (= cluster-id-for-araB-araA-araD 8) [9.110344 0.207067]))
        (define araD
            (gaussian araD-mean araD-std))



        ;; Column grouping for view: araC, arabinose, glucose
        (define cluster-id-for-araC-arabinose-glucose
            (categorical [0.232974 0.299847 0.000679 0.102748 0.064032 0.144983 0.000679 0.028836 0.074591 0.000679 0.049953]))
        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araC-arabinose-glucose 0) [7.926350 0.488023]
                (= cluster-id-for-araC-arabinose-glucose 1) [9.153015 0.566170]
                (= cluster-id-for-araC-arabinose-glucose 2) [12.047214 0.115716]
                (= cluster-id-for-araC-arabinose-glucose 3) [8.684805 0.916113]
                (= cluster-id-for-araC-arabinose-glucose 4) [7.571625 0.445217]
                (= cluster-id-for-araC-arabinose-glucose 5) [7.465613 0.624895]
                (= cluster-id-for-araC-arabinose-glucose 6) [7.724573 0.107366]
                (= cluster-id-for-araC-arabinose-glucose 7) [13.283272 0.743700]
                (= cluster-id-for-araC-arabinose-glucose 8) [7.858124 0.409104]
                (= cluster-id-for-araC-arabinose-glucose 9) [8.182426 0.050990]
                (= cluster-id-for-araC-arabinose-glucose 10) [8.063486 0.674934]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araC-arabinose-glucose 0) [0.380471 0.999164]
                (= cluster-id-for-araC-arabinose-glucose 1) [8.149612 0.864407]
                (= cluster-id-for-araC-arabinose-glucose 2) [5.328411 0.041753]
                (= cluster-id-for-araC-arabinose-glucose 3) [-0.560752 1.105839]
                (= cluster-id-for-araC-arabinose-glucose 4) [0.590297 0.982307]
                (= cluster-id-for-araC-arabinose-glucose 5) [-0.023824 0.796953]
                (= cluster-id-for-araC-arabinose-glucose 6) [-0.263402 0.513236]
                (= cluster-id-for-araC-arabinose-glucose 7) [16.586393 1.154188]
                (= cluster-id-for-araC-arabinose-glucose 8) [-0.065307 0.953554]
                (= cluster-id-for-araC-arabinose-glucose 9) [0.081057 0.315636]
                (= cluster-id-for-araC-arabinose-glucose 10) [16.434587 0.732904]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araC-arabinose-glucose 0) [0.095846 0.972025]
                (= cluster-id-for-araC-arabinose-glucose 1) [-0.027792 0.866138]
                (= cluster-id-for-araC-arabinose-glucose 2) [5.422972 0.970434]
                (= cluster-id-for-araC-arabinose-glucose 3) [-0.475219 0.702996]
                (= cluster-id-for-araC-arabinose-glucose 4) [20.661248 1.566169]
                (= cluster-id-for-araC-arabinose-glucose 5) [11.535727 1.072039]
                (= cluster-id-for-araC-arabinose-glucose 6) [26.544677 0.464106]
                (= cluster-id-for-araC-arabinose-glucose 7) [-0.467063 0.815387]
                (= cluster-id-for-araC-arabinose-glucose 8) [5.267843 0.966117]
                (= cluster-id-for-araC-arabinose-glucose 9) [44.366990 1.637382]
                (= cluster-id-for-araC-arabinose-glucose 10) [-0.410376 0.906017]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-13
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.050020 0.307594 0.144134 0.010393 0.045066 0.050020 0.079740 0.163947 0.149087]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.529859 0.253931]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.099686 0.169540]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.247318 0.107254]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.886820 0.321847]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.232972 0.099613]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.137622 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.992197 0.234027]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.052242 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.631628 0.204979]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.994751 0.435277]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [9.186519 0.422039]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.978958 0.416812]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.473516 0.552838]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [6.957095 0.333834]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [11.107128 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.631871 0.891659]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.335589 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.421552 0.609236]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.714208 0.167858]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.148917 0.148181]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.250949 0.173409]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.000928 0.233507]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.992085 0.155844]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.131527 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.912465 0.192588]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.030982 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.522103 0.179655]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.776141 0.139810]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.317361 0.137485]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.438178 0.143218]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.510654 0.223771]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.339525 0.171083]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.523893 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.183216 0.161860]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.406501 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.873541 0.230669]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.213032 0.909610]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.237223 0.899755]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.056943 1.016281]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.071141 1.117476]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.551404 0.961963]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [16.666629 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.226752 1.392392]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.078157 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.127625 1.041325]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [5.714434 0.852416]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.085018 0.844914]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.365732 0.884320]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [4.857350 0.850148]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [20.785039 1.572914]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.664779 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.755136 0.876458]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [11.488926 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.119848 0.753377]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-14
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.050446 0.290233 0.045450 0.055441 0.205308 0.000490 0.010481 0.070428 0.165344 0.100402 0.000490 0.005486]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.141748 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.066297 0.164271]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.349841 0.099613]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.713599 0.259754]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.408342 0.174151]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.179562 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [13.536314 0.156198]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.854024 0.244145]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.219514 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.699425 0.226555]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [12.768710 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [9.221800 0.187859]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [11.208531 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.962716 0.318101]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.324225 0.333834]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.647860 0.457094]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.767941 0.414136]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.833063 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [10.331187 0.295605]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.874256 0.819788]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.261277 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.584678 0.672718]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [9.991910 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [9.043176 0.434248]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.917823 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.104783 0.137994]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.169509 0.155844]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.409649 0.211176]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.300730 0.225881]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.986393 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [13.494288 0.139277]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.771831 0.192283]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.951037 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.578260 0.197329]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [12.489829 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [9.351789 0.233345]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.666902 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.305382 0.139886]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.540743 0.171083]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.856779 0.169461]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.368977 0.132206]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.443259 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [12.230956 0.168337]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.322811 0.161331]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.443617 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.815929 0.171019]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [11.497021 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [9.501973 0.238465]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [16.611331 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.148067 0.922521]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.441084 0.961963]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.402751 0.912450]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.214186 1.114996]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.949261 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.349598 0.304938]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.217117 1.394306]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.078009 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.097900 0.871159]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.893996 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [0.288961 1.097068]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.737018 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.145852 0.844324]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [21.043478 1.572914]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [5.582775 0.827383]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.373515 0.923913]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.717555 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.389227 0.963417]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.580534 0.918475]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [11.658945 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.125176 0.681079]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [0.427105 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [4.265697 0.799115]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-15
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.033147 0.349216 0.007862 0.235432 0.007862 0.058433 0.014183 0.165896 0.127968]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.926489 0.151057]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.004586 0.164271]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.107784 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.282709 0.160341]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.266168 0.161813]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.007846 0.261265]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.315761 0.095414]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.196728 0.178134]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.723284 0.204260]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.631893 0.233675]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [9.082885 0.318101]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [13.178633 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.090997 0.402878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.773557 0.495546]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.936702 0.706972]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [6.931506 0.261146]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.309868 0.554717]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.284671 0.660443]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.329005 0.185731]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.146238 0.137994]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.822044 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.213457 0.220014]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.108517 0.318134]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.835679 0.207773]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.821030 0.115570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.892146 0.174284]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.512136 0.187008]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.923177 0.182744]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.254640 0.139886]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.668830 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.603121 0.132144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.442421 0.274701]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.284722 0.155391]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.458953 0.116171]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.264280 0.139926]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.886723 0.208705]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.300227 0.840640]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.146289 0.922521]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [16.465273 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.138711 1.025224]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.084781 1.113153]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.087492 1.517509]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.514310 1.037219]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.024728 0.783008]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.195534 0.950731]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [5.660518 0.832655]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.034876 0.844324]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.399382 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.150870 0.933603]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [5.010266 1.076895]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.572898 0.971612]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [21.591845 1.073483]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [11.673576 1.020675]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.125631 0.733363]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-16
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.363066 0.007140 0.035844 0.035844 0.242510 0.001399 0.076029 0.173621 0.064547]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.089498 0.188144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.922227 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.091155 0.099613]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.730996 0.211534]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.349948 0.167298]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.440603 0.170221]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.959866 0.235051]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.025656 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.798241 0.200135]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.140494 0.507540]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.440718 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [6.861136 0.333834]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.207107 0.238973]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.877948 0.370378]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.665244 0.507535]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.811284 0.820143]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.508946 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.427068 0.692294]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.166378 0.175966]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.868934 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.156805 0.155844]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.490382 0.193965]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.341579 0.202624]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.385706 0.306295]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.925020 0.178922]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.899183 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.581241 0.210924]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.317273 0.157570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.855893 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.476225 0.171083]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.001758 0.176591]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.550841 0.172042]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.311567 0.259519]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.333883 0.148300]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.442176 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.023554 0.192398]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.156695 0.879777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [16.776454 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.482726 0.961963]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.347239 0.819069]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.130963 1.053672]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.294364 1.173358]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.032262 1.408353]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.150627 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.188052 0.917215]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.020141 0.880588]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [-0.682151 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [20.965215 1.572914]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [5.583425 0.826529]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.122091 0.920513]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [4.776482 1.056901]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.566923 0.965113]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [11.541602 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.162922 0.710180]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-17
    (gen []
            ;; Column grouping for view: araB, araA, araD
        (define cluster-id-for-araB-araA-araD
            (categorical [0.034577 0.008604 0.249785 0.160734 0.004893 0.016025 0.312863 0.001183 0.064261 0.023446 0.123629]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [9.183554 0.283694]
                (= cluster-id-for-araB-araA-araD 1) [12.067985 0.378755]
                (= cluster-id-for-araB-araA-araD 2) [13.118675 0.166485]
                (= cluster-id-for-araB-araA-araD 3) [8.628108 0.199201]
                (= cluster-id-for-araB-araA-araD 4) [11.296595 0.178275]
                (= cluster-id-for-araB-araA-araD 5) [12.721147 0.191482]
                (= cluster-id-for-araB-araA-araD 6) [8.163147 0.131243]
                (= cluster-id-for-araB-araA-araD 7) [7.258375 0.401389]
                (= cluster-id-for-araB-araA-araD 8) [10.280471 10.011971]
                (= cluster-id-for-araB-araA-araD 9) [13.463208 0.191861]
                (= cluster-id-for-araB-araA-araD 10) [7.859574 0.202328]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [9.316020 0.218894]
                (= cluster-id-for-araB-araA-araD 1) [12.221399 0.089955]
                (= cluster-id-for-araB-araA-araD 2) [13.092525 0.143039]
                (= cluster-id-for-araB-araA-araD 3) [8.450908 0.192373]
                (= cluster-id-for-araB-araA-araD 4) [11.817114 0.218614]
                (= cluster-id-for-araB-araA-araD 5) [12.866540 0.137534]
                (= cluster-id-for-araB-araA-araD 6) [8.032425 0.166912]
                (= cluster-id-for-araB-araA-araD 7) [6.875719 0.248293]
                (= cluster-id-for-araB-araA-araD 8) [10.651924 9.917772]
                (= cluster-id-for-araB-araA-araD 9) [13.563553 0.164107]
                (= cluster-id-for-araB-araA-araD 10) [7.798478 0.157951]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araA-araD 0) [9.328864 0.187634]
                (= cluster-id-for-araB-araA-araD 1) [11.124354 0.221280]
                (= cluster-id-for-araB-araA-araD 2) [12.282604 0.136505]
                (= cluster-id-for-araB-araA-araD 3) [8.858894 0.190444]
                (= cluster-id-for-araB-araA-araD 4) [10.816360 0.193391]
                (= cluster-id-for-araB-araA-araD 5) [11.437275 0.221637]
                (= cluster-id-for-araB-araA-araD 6) [8.399856 0.171007]
                (= cluster-id-for-araB-araA-araD 7) [9.193518 0.133112]
                (= cluster-id-for-araB-araA-araD 8) [9.638802 9.826214]
                (= cluster-id-for-araB-araA-araD 9) [12.598229 0.116368]
                (= cluster-id-for-araB-araA-araD 10) [8.256136 0.119205]))
        (define araD
            (gaussian araD-mean araD-std))



        ;; Column grouping for view: araC, arabinose, glucose
        (define cluster-id-for-araC-arabinose-glucose
            (categorical [0.022624 0.311906 0.323177 0.045166 0.146602 0.060193 0.075221 0.015110]))
        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araC-arabinose-glucose 0) [13.639541 0.743700]
                (= cluster-id-for-araC-arabinose-glucose 1) [9.290574 0.566170]
                (= cluster-id-for-araC-arabinose-glucose 2) [8.087339 0.566370]
                (= cluster-id-for-araC-arabinose-glucose 3) [8.343003 0.674934]
                (= cluster-id-for-araC-arabinose-glucose 4) [7.498465 0.624895]
                (= cluster-id-for-araC-arabinose-glucose 5) [7.242677 0.445217]
                (= cluster-id-for-araC-arabinose-glucose 6) [8.090243 0.420929]
                (= cluster-id-for-araC-arabinose-glucose 7) [9.314353 0.578757]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araC-arabinose-glucose 0) [16.560142 1.154188]
                (= cluster-id-for-araC-arabinose-glucose 1) [8.169447 0.864407]
                (= cluster-id-for-araC-arabinose-glucose 2) [0.076567 1.120961]
                (= cluster-id-for-araC-arabinose-glucose 3) [16.466121 0.732904]
                (= cluster-id-for-araC-arabinose-glucose 4) [0.052313 0.796953]
                (= cluster-id-for-araC-arabinose-glucose 5) [0.396511 0.982307]
                (= cluster-id-for-araC-arabinose-glucose 6) [-0.161450 0.998637]
                (= cluster-id-for-araC-arabinose-glucose 7) [0.410292 0.866752]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araC-arabinose-glucose 0) [-0.496661 0.815387]
                (= cluster-id-for-araC-arabinose-glucose 1) [0.049043 0.866138]
                (= cluster-id-for-araC-arabinose-glucose 2) [-0.066064 0.930891]
                (= cluster-id-for-araC-arabinose-glucose 3) [-0.307157 0.906017]
                (= cluster-id-for-araC-arabinose-glucose 4) [11.569318 1.072039]
                (= cluster-id-for-araC-arabinose-glucose 5) [20.783844 1.566169]
                (= cluster-id-for-araC-arabinose-glucose 6) [5.097898 1.131010]
                (= cluster-id-for-araC-arabinose-glucose 7) [0.054378 0.667669]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-18
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.308741 0.037720 0.234343 0.058977 0.021778 0.000521 0.000521 0.074919 0.090862 0.011150 0.000521 0.159945]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.067569 0.164271]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.429111 0.097006]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.314569 0.171873]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.744614 0.254257]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.950375 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.133365 0.052280]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [12.731318 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.982826 0.239642]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.776956 0.212052]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [13.498138 0.156198]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.995994 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.100558 0.175650]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.046896 0.318101]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.237517 0.328839]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.016645 0.389602]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.104335 0.502934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [13.530776 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.009627 0.124759]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [9.343332 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.851225 0.839825]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.405126 0.698210]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [10.774946 0.295605]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.336992 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [7.471138 0.582687]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.103589 0.137994]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.861287 0.112196]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.301502 0.225260]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.498595 0.189165]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.774653 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.893862 0.067409]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [12.246480 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.840851 0.190344]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.704730 0.197375]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [13.596412 0.139277]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.682842 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [7.883737 0.171916]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.348197 0.139886]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.391623 0.116522]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.450141 0.158598]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.962017 0.151456]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.755303 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.368463 0.092270]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [11.077250 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.122643 0.146803]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.958542 0.187951]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [12.477095 0.168337]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.122210 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.351096 0.155225]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.160250 0.922521]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.545929 1.016740]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.001073 1.072593]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.355195 0.901595]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [16.590219 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [16.876412 0.673190]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.334259 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.376847 1.378685]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.030607 0.971268]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.832449 0.304938]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.341467 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [0.113273 0.783045]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.107299 0.844324]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [21.271916 1.270312]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.214361 0.900332]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [5.512348 0.968384]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [-0.345634 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.407742 1.033946]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.292301 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.647991 0.916072]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.027958 0.785772]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.692329 0.963417]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [-0.518714 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [11.588786 1.019317]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-19
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.049024 0.189814 0.078153 0.087863 0.039315 0.325749 0.000476 0.019896 0.160685 0.049024]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.177999 0.171020]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.289003 0.152146]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.109521 0.151346]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.666208 0.182428]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.796479 0.205910]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [13.125568 0.186871]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.296570 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [9.158032 0.291234]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.139930 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.148873 0.127761]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.529200 0.390018]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.861225 0.332117]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.647122 0.862580]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.561054 0.632484]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.917228 0.190586]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.228938 0.517972]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.436087 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.343736 0.611015]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.407589 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [11.444514 2.875439]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.047367 0.189620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.231609 0.196003]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.914226 0.182495]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.562823 0.194541]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.574668 0.123206]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [13.180823 0.176212]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.087168 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [9.109543 0.293357]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.950650 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [7.840341 0.170620]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.562669 0.200102]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.489854 0.179652]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.232163 0.145943]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.914355 0.233115]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.778166 0.141347]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [12.311980 0.185115]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.723390 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [9.142656 0.246339]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.377934 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.512823 0.229660]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.256737 0.973843]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.333087 1.065268]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.150862 1.229879]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.078774 0.926248]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [-0.351889 0.811023]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.186444 0.900155]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.448805 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.101879 1.179990]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.014352 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [16.594777 1.010053]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [20.938303 1.588028]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.228974 0.946650]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.402594 0.899763]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.064270 0.693685]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [5.561846 0.853622]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.101757 0.879481]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.670321 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [5.264356 1.031415]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [11.626705 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.637003 0.909044]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-20
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.329875 0.001482 0.183923 0.001482 0.123109 0.220411 0.007563 0.062296 0.031889 0.037970]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.099342 0.160004]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.433314 0.147759]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.087485 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.212163 0.137756]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.632109 0.203629]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.263380 0.162693]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.866326 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.056951 0.263407]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.469419 0.151057]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.235755 0.099613]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.996313 0.318842]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [10.431752 0.419899]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.304355 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.944702 0.440795]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.242130 0.659662]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.067135 0.371936]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [13.490225 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.739950 0.839493]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.153029 0.233675]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [7.242587 0.333834]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.192428 0.133926]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.329863 0.132298]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.023832 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.170117 0.279586]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.501293 0.189308]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.224980 0.214006]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.799424 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.771295 0.189143]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.265211 0.185731]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.023239 0.155844]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.196609 0.140948]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.452135 0.168570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.258483 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [9.198418 0.174382]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.956867 0.196265]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.391692 0.138703]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.717294 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.386047 0.166441]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.023775 0.182744]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.344570 0.171083]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.145406 0.924211]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.493853 0.332700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.055007 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.209383 1.109464]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.009361 0.950781]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.256761 1.040700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [16.611581 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.206841 1.499718]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.326294 0.840640]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [0.338450 0.961963]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.200032 0.846301]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [-0.414038 0.908647]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [11.597288 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [4.992862 1.132006]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.053848 0.720832]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.297154 0.929465]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.499338 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.624264 0.924556]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [5.444382 0.832655]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [20.913876 1.572914]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-21
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.216162 0.046347 0.303365 0.147318 0.005040 0.184035 0.000450 0.078474 0.018809]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.119361 0.162903]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.233788 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [13.109836 0.188144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.748859 0.207953]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.664855 0.198054]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.321194 0.183450]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.860821 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.987054 0.245611]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.427132 0.192197]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.461089 0.594204]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [11.328157 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [9.243160 0.507540]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.034118 0.511999]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.992662 0.242078]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.756692 0.371302]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.959442 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [9.029277 0.756538]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.068995 0.585658]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.930643 0.205037]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.955858 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [13.088852 0.175966]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.468247 0.181234]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.745166 0.302872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.322247 0.219372]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.955944 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.774870 0.186087]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.125768 0.259268]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.367415 0.166421]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.700109 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [12.285736 0.157570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.905948 0.166971]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [9.080930 0.183025]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.497659 0.125615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.336582 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.239460 0.146360]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.108827 0.168425]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.202878 0.852861]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [16.611362 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.212867 0.879777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.163727 0.919077]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.392101 0.986473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.170432 1.036456]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.097349 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.156892 1.405139]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.374172 1.074517]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [14.283263 4.341106]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [-0.555801 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.113472 0.880588]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [2.626209 3.058853]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [22.515219 3.329394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.065527 0.884424]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-1.034058 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.521639 1.059812]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [4.128817 2.150776]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-22
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.155330 0.324817 0.227233 0.037203 0.155330 0.011524 0.088563]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.616714 0.158314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.115693 0.188144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.215795 0.162903]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.070675 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.367829 0.174648]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.170179 0.144161]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.070099 0.150476]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.080526 0.492090]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [9.211478 0.507540]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.420369 0.594204]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [11.113261 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.740454 0.380783]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.199862 0.573262]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.680742 0.842904]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.659676 0.174945]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.140338 0.175966]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.921138 0.205037]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.056774 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.395914 0.202563]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.056737 0.266193]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.893982 0.191318]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.948543 0.186074]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.334445 0.157570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.361664 0.166421]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.599956 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.613038 0.120579]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.120545 0.180653]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.274933 0.146579]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.302605 0.873749]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.204823 0.879777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.166658 0.852861]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [16.732969 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.427007 0.929495]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.351576 1.046200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.061857 1.330199]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [2.313465 2.969225]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.167920 0.880588]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [14.296954 4.341106]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.708771 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.312753 0.943124]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [4.499767 2.202654]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.339902 0.919828]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-23
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.355436 0.029679 0.022275 0.014872 0.259190 0.066697 0.185154 0.066697]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.099475 0.152361]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.600327 0.251848]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.208975 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.121623 0.099613]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.345297 0.180296]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.042296 0.200522]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.121465 0.173754]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.825172 0.211192]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.224755 0.307676]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.195319 0.305864]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [11.011377 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [6.786286 0.333834]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.025636 0.380365]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.678030 0.836168]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.366721 0.628100]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.261954 0.718305]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.208486 0.129474]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.535559 0.211605]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.026350 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.025146 0.155844]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.319352 0.213922]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.930981 0.188342]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.001247 0.219757]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.413160 0.202826]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.318632 0.138676]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [9.138048 0.175559]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.551585 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.473575 0.171083]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.641139 0.147924]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.221919 0.148343]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.430819 0.160465]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [9.026285 0.175831]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.197212 0.937787]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [-0.356928 0.816771]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [16.796540 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [0.337382 0.961963]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [-0.010608 1.079195]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.283230 1.214260]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.113853 0.776880]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.104707 0.887785]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.149206 0.858695]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [5.687448 1.340143]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.501193 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [20.919886 1.572914]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.151237 0.866623]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.232074 1.099473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [11.738128 1.017147]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.147093 0.769513]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-24
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.303365 0.220752 0.046347 0.124370 0.211573 0.005040 0.023398 0.000450 0.064705]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.138184 0.188144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.162856 0.166810]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.946731 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.828451 0.179958]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.313455 0.179596]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.769213 0.198054]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [9.328232 0.159688]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.082758 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.980789 0.244227]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.170604 0.507540]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.283680 0.594888]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [11.476813 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.286063 0.524975]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.966917 0.412694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.499974 0.242078]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.685516 0.633561]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.279395 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [9.146071 0.798055]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.131914 0.175966]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.978185 0.212382]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.876029 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.430421 0.184179]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.367478 0.216769]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.786219 0.302872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.885791 0.258132]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.029626 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.812963 0.170518]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.322131 0.157570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.378593 0.166504]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.543624 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.981939 0.158757]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.577800 0.139862]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.424115 0.183025]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [9.035970 0.179541]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.268129 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.103551 0.134500]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.156675 0.879777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.223566 0.849823]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [16.811863 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.202332 0.806458]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.165996 1.088652]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.557303 0.986473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.260700 1.080485]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.978633 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.166955 1.448393]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.043146 0.880588]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [14.104000 4.409716]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.448076 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [2.546266 3.011944]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.170551 0.925632]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [21.833629 3.329394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [2.860273 2.532721]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-1.221334 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-0.495472 0.922696]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-25
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.313311 0.198372 0.242158 0.006807 0.149112 0.072486 0.017754]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.048252 0.166604]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.356207 0.166900]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.150360 0.182583]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.617101 0.161153]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.360847 0.121875]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.092012 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [12.767389 0.423374]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [9.024291 0.367234]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.918637 0.330541]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.194968 0.509110]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.103272 0.508030]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.441821 0.130358]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.898416 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [10.011988 0.321983]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [13.119571 0.142324]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.260122 0.225394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [7.902167 0.173524]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.438604 0.171628]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.351301 0.337377]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.938196 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [12.524946 0.316878]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [12.309649 0.138800]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.428805 0.137340]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.300437 0.168067]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.975843 0.193262]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.546624 0.108471]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.392802 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [11.055116 0.179988]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.181493 0.910824]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.074976 1.145657]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.142568 0.843561]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.197494 0.814510]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.030550 0.607166]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.085445 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.163469 0.986765]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.117479 0.852946]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.115386 0.926783]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [15.210911 7.475152]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [2.237789 2.756577]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [10.309073 1.110824]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.737717 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.455855 0.640615]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-26
    (gen []
            ;; Column grouping for view: glucose
        (define cluster-id-for-glucose
            (categorical [0.756892 0.040929 0.008385 0.001153 0.095168 0.066240 0.022849 0.008385]))
        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-glucose 0) [-0.080163 0.907434]
                (= cluster-id-for-glucose 1) [10.699393 0.854313]
                (= cluster-id-for-glucose 2) [19.609706 0.854585]
                (= cluster-id-for-glucose 3) [12.040553 0.905879]
                (= cluster-id-for-glucose 4) [5.530493 0.625439]
                (= cluster-id-for-glucose 5) [5.328983 1.015245]
                (= cluster-id-for-glucose 6) [22.071567 1.006937]
                (= cluster-id-for-glucose 7) [20.079095 0.542327]))
        (define glucose
            (gaussian glucose-mean glucose-std))



        ;; Column grouping for view: araB, araC, araA, araD, arabinose
        (define cluster-id-for-araB-araC-araA-araD-arabinose
            (categorical [0.249887 0.221222 0.049231 0.012375 0.352263 0.041041 0.057421 0.008280 0.008280]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [13.112644 0.163004]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.654680 0.206582]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.172220 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [13.478533 0.118850]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.182500 0.144094]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [9.215742 0.259833]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [7.921459 0.233001]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [8.100780 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [12.539704 0.305201]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [9.114727 0.348920]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.100331 0.470280]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [10.862278 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [10.891507 0.315194]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [7.692548 0.694307]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.655224 0.707047]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.145643 1.250188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [7.927356 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [9.699769 0.501231]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [13.112206 0.137795]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.550696 0.181583]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.010578 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [13.518297 0.119013]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.025935 0.189002]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [9.111607 0.304543]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [7.686478 0.139586]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [7.711484 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [12.949398 0.272184]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [12.231164 0.138806]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.770786 0.231462]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.617262 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [12.219070 0.158290]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.414088 0.152792]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [9.230922 0.244544]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [8.145220 0.151687]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [8.293791 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [12.214995 0.284887]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.242733 0.917331]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [-0.095038 0.961676]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [16.674852 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.404994 0.314334]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [0.176849 0.927550]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [0.334249 1.055290]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [0.253985 1.482628]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [8.283962 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [15.843458 0.349587]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-27
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose
        (define cluster-id-for-araB-araC-araA-araD-arabinose
            (categorical [0.259675 0.000446 0.368824 0.004994 0.268771 0.041377 0.036829 0.018638 0.000446]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.633939 0.187992]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.126122 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.163298 0.133058]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [13.422511 0.115767]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [13.071000 0.161833]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [7.793731 0.211497]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [9.273874 0.183695]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [8.145949 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.241933 0.052280]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.023749 0.445916]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.054043 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [7.708880 0.785374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [9.178583 0.467992]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [9.010700 0.366094]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.285323 1.002081]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [9.012639 0.671205]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [13.744355 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [7.287313 0.124759]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.510365 0.173127]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [7.608555 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.020827 0.164141]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [13.592195 0.123334]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [13.095747 0.139514]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [7.685067 0.147481]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [9.016578 0.260295]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [7.793605 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.107763 0.067409]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [8.799687 0.234777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.086425 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [8.328668 0.144335]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [12.647349 0.161190]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [12.248070 0.139103]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [8.017569 0.156692]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [9.056965 0.190675]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [8.639429 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [8.342569 0.092270]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose 0) [-0.074057 0.985333]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 1) [8.284497 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 2) [0.043456 0.908149]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 3) [8.201232 0.342915]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 4) [8.209131 0.918528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 5) [0.564935 1.517063]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 6) [0.369014 1.041617]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 7) [16.477791 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose 8) [16.717900 0.673190]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))



        ;; Column grouping for view: glucose
        (define cluster-id-for-glucose
            (categorical [0.778594 0.101139 0.056225 0.003825 0.011311 0.026282 0.018797 0.003825]))
        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-glucose 0) [-0.015332 0.907434]
                (= cluster-id-for-glucose 1) [11.788169 0.765150]
                (= cluster-id-for-glucose 2) [10.515335 0.712793]
                (= cluster-id-for-glucose 3) [5.279075 0.886703]
                (= cluster-id-for-glucose 4) [5.626907 1.149992]
                (= cluster-id-for-glucose 5) [21.571808 1.062414]
                (= cluster-id-for-glucose 6) [19.544550 0.996456]
                (= cluster-id-for-glucose 7) [10.598370 0.807307]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-28
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.233396 0.286774 0.136346 0.019886 0.000476 0.005329 0.218839 0.092674 0.000476 0.000476 0.005329]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.148757 0.166443]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.107777 0.154760]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.815251 0.225677]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.949116 0.121175]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.281683 0.052280]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.616773 0.198054]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.399426 0.195499]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.210743 0.244835]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.120986 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [13.388873 0.183462]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [9.513058 0.169651]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.358130 0.614113]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [9.095788 0.345931]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.120153 0.676441]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [13.109525 0.743700]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.271330 0.124759]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [7.669234 0.242078]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.755258 0.360452]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.815883 0.780481]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.570820 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [9.891806 0.271787]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.496069 0.303669]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.981294 0.224729]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [13.150791 0.148141]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.495961 0.217192]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.736104 0.098322]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.041890 0.067409]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.745845 0.302872]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.383300 0.209335]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [7.951270 0.191985]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.856340 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [13.454864 0.161334]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [9.299277 0.227840]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.433538 0.170760]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [12.289138 0.138930]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.859439 0.162273]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.496510 0.221314]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.604590 0.092270]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [9.094588 0.183025]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.632541 0.160345]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.358353 0.141615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.561275 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [12.337298 0.187082]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [9.295871 0.265802]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [0.169313 0.845200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.192371 0.916619]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [-0.163140 0.882521]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [16.622904 1.154188]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [16.847824 0.673190]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [0.523740 0.986473]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.224770 1.008543]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.054953 1.447882]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [7.974251 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.257642 0.359320]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [0.335714 1.165269]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [14.177921 4.336695]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.095786 0.812947]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [3.068263 2.840269]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.553375 0.815387]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [-0.872470 1.033946]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [22.220317 3.329394]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [0.080864 0.866518]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [-0.473860 1.044366]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [-1.004804 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [0.140831 1.338381]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [4.974743 0.950295]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))



(define data-generating-process-model-29
    (gen []
            ;; Column grouping for view: araB, araC, araA, araD, arabinose, glucose
        (define cluster-id-for-araB-araC-araA-araD-arabinose-glucose
            (categorical [0.068712 0.044343 0.322151 0.049217 0.234422 0.044343 0.000478 0.000478 0.000478 0.010226 0.161315 0.063838]))
        (define [araB-mean araB-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.978403 0.255494]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.125777 0.099613]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [13.086110 0.188144]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.112911 0.127761]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.324769 0.193365]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.729505 0.224367]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.226595 0.117200]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [12.545310 0.423374]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [12.782466 0.305201]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [9.109529 0.316331]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.109894 0.179297]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.778902 0.218518]))
        (define araB
            (gaussian araB-mean araB-std))

        (define [araC-mean araC-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.758844 0.834471]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [6.925538 0.333834]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [9.061772 0.507540]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [11.532984 2.875439]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [7.874307 0.374986]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.031139 0.436160]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.063885 0.167498]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [9.730114 0.321983]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [8.057447 0.501231]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [8.815656 0.508979]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [7.470277 0.647162]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.194683 0.758923]))
        (define araC
            (gaussian araC-mean araC-std))

        (define [araA-mean araA-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [7.758095 0.188967]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [7.932952 0.155844]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [13.139890 0.175966]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [7.947109 0.170620]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.223865 0.220553]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.500095 0.129769]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [7.945654 0.156635]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [12.550628 0.316878]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [12.726623 0.272184]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [9.230976 0.204585]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.058787 0.245528]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.517246 0.213215]))
        (define araA
            (gaussian araA-mean araA-std))

        (define [araD-mean araD-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [8.361087 0.155283]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [8.562161 0.171083]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [12.336789 0.157570]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [8.646514 0.229660]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [8.510834 0.162369]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [8.944548 0.141349]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.559239 0.125897]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [11.142459 0.179988]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [12.030547 0.284887]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [9.478992 0.131255]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [8.441051 0.167728]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [8.976722 0.160113]))
        (define araD
            (gaussian araD-mean araD-std))

        (define [arabinose-mean arabinose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.013147 1.470377]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [0.651481 0.961963]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [8.199941 0.879777]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [16.599959 1.010053]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.190986 1.054064]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [-0.089880 0.883575]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [8.047091 0.683934]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [8.173882 0.986765]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [16.124953 0.349587]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [-0.115513 1.170705]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [0.079349 0.766889]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [0.002997 0.870632]))
        (define arabinose
            (gaussian arabinose-mean arabinose-std))

        (define [glucose-mean glucose-std]
            (cond
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 0) [-0.433487 0.910825]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 1) [20.950605 1.572914]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 2) [0.095470 0.880588]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 3) [-0.534513 0.909044]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 4) [0.218986 0.933645]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 5) [5.515615 0.842640]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 6) [-0.513050 0.531694]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 7) [0.305387 0.640615]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 8) [0.110920 0.521876]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 9) [4.777747 1.051358]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 10) [11.606502 1.032131]
                (= cluster-id-for-araB-araC-araA-araD-arabinose-glucose 11) [0.031998 0.668832]))
        (define glucose
            (gaussian glucose-mean glucose-std))


    ;; return a newly generated row.
    [araC araB araA araD arabinose glucose]))





(define ensemble [
    data-generating-process-model-0
            data-generating-process-model-1
            data-generating-process-model-2
            data-generating-process-model-3
            data-generating-process-model-4
            data-generating-process-model-5
            data-generating-process-model-6
            data-generating-process-model-7
            data-generating-process-model-8
            data-generating-process-model-9
            data-generating-process-model-10
            data-generating-process-model-11
            data-generating-process-model-12
            data-generating-process-model-13
            data-generating-process-model-14
            data-generating-process-model-15
            data-generating-process-model-16
            data-generating-process-model-17
            data-generating-process-model-18
            data-generating-process-model-19
            data-generating-process-model-20
            data-generating-process-model-21
            data-generating-process-model-22
            data-generating-process-model-23
            data-generating-process-model-24
            data-generating-process-model-25
            data-generating-process-model-26
            data-generating-process-model-27
            data-generating-process-model-28
            data-generating-process-model-29])

;; simulate from a model in the ensemble
(define simulate-new-row-from-ensemble
    (gen []
        (define current-model (uniform-sample
            ensemble
    ))
    (current-model)))
