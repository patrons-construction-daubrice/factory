# Factory

Patron de construction **Factory** (INF4067, devoir n°1).

- `cours/` : exemple vu en cours
- `modifie/` : exemple modifié

Chaque dossier est un projet Eclipse (File > Import > Existing Projects into Workspace) et contient `src/` (code Java) et `diagrammes/` (fichiers .dia et images).

## Exécution (terminal)

```bash
cd cours   # ou modifie
javac -d bin $(find src -name "*.java")
java -cp bin patronfactory.factory_Method.Client` et `patronfactory.factory.Client
```
