package sgit

import org.eclipse.jgit._

object SGit {

  type RepositoryBuilder = org.eclipse.jgit.lib.RepositoryBuilder
  type Repository = org.eclipse.jgit.lib.Repository
  type FileRepositoryBuilder = org.eclipse.jgit.storage.file.FileRepositoryBuilder
}


class Git (repository : SGit.Repository) extends Proxy  {
   def self = new api.Git(repository)

}
